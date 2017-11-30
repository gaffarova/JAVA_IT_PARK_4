import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class HumansDaoJdbcTemplate implements HumansDao {

    //language=SQL
    private static final String SQL_SELECT_BY_NAME =
            "SELECT FROM owner WHERE name = ?";

    //language=SQL
    private static final String SQL_INSERT_USER =
            "INSERT INTO owner(age, name) VALUES (?, ?)";

    //language=SQL
    private static final String SQL_FIND_BY_ID =
            "SELECT FROM owner WHERE id = ?";

    //language=SQL
    private static final String SQL_FIND_ALL =
            "SELECT * FROM owner";

    //language=SQL
    private static final String SQL_DELETE_BY_ID =
            "DELETE FROM owner WHERE id = ?";

    //language=SQL
    private static final String SQL_UPDATE_AGE =
            "UPDATE owner SET age = ? WHERE id = ?";

    private JdbcTemplate template;

    private RowMapper<Human> rowMapper = (resultSet, rowNum) -> {
        Human result = Human.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .age(resultSet.getInt("age"))
                .build();
        return result;
    };

    public HumansDaoJdbcTemplate(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public List<Human> findAllByAge(int age) {
        return null;
    }

    public Human findOneByName(String name) {
        List<Human> result =
                template.query
                        (SQL_SELECT_BY_NAME, rowMapper, name);
        if (result.size() > 0) {
            return result.get(0);
        }
        return null;
    }


    public void save(Human model) {
        template.update
                (SQL_INSERT_USER, model.getAge(), model.getName());
    }

    public Human find(Long id) {
        List<Human> result =
                template.query
                        (SQL_FIND_BY_ID, rowMapper, id);
        if (result.size() > 0) {
            return (result.get(0));
        }
        return null;
    }

    public void update(Human model) {
        template.update
                (SQL_UPDATE_AGE, model.getAge(), model.getId());
    }

    public void delete(Long id) {
        template.update
                (SQL_DELETE_BY_ID, id);
    }

    public List<Human> findAll() {
        List<Human> result =
                template.query
                        (SQL_FIND_ALL, rowMapper);

        return result;
    }
}
