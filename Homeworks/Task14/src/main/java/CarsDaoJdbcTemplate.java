import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class CarsDaoJdbcTemplate implements CarsDao {

    //language=SQL
    private static final String SQL_FIND_ALL =
            "SELECT * FROM car";

    //language=SQL
    private static final String SQL_SELECT_BY_NUMBER =
            "SELECT FROM car WHERE number = ?";

    //language=SQL
    private static final String SQL_INSERT_CAR =
            "INSERT INTO car(model, number) VALUES (?, ?)";

    //language=SQL
    private static final String SQL_DELETE_BY_ID=
            "DELETE FROM car WHERE id = ?";

    //language=SQL
    private static final String SQL_FIND_BY_ID =
            "SELECT FROM car WHERE id = ?";

    //language=SQL
    private static final String SQL_UPDATE_NUMBER =
            "UPDATE car SET number = ? WHERE id = ?";

    private JdbcTemplate template;

    private RowMapper<Car> rowMapper = (resultSet, rowNum) -> {
        Car result = Car.builder()
                .id(resultSet.getLong("id"))
                .number(resultSet.getString("number"))
                .model(resultSet.getString("model"))
                .build();
        return result;
    };

    public CarsDaoJdbcTemplate(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public List<Car> findAllByModel(String model) {
        return null;
    }

    public Car findOneByNumber(String number) {
        List<Car> result =
                template.query(SQL_SELECT_BY_NUMBER, rowMapper, number);
        if (result.size() > 0) {
            return result.get(0);
        }
        return null;
    }

    public void save(Car model) {
        template.update
                (SQL_INSERT_CAR, model.getModel(), model.getNumber());
    }

    public void delete(Long id) {
        template.update
                (SQL_DELETE_BY_ID, id);
    }

    public void update(Car model) {
        template.update
                (SQL_UPDATE_NUMBER, model.getNumber(), model.getId());
    }

    public Car find(Long id) {
        List<Car> result =
                template.query
                        (SQL_FIND_BY_ID, rowMapper, id);
        if (result.size() > 0) {
            return (result.get(0));
        }
        return null;
    }

    public List<Car> findAll() {
        List<Car> result =
                template.query
                        (SQL_FIND_ALL, rowMapper);
        return result;
    }
}

