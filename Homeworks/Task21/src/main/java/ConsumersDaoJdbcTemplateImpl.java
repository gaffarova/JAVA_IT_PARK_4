import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class ConsumersDaoJdbcTemplateImpl implements ConsumersDao<Consumer> {

    //language=SQL
    private static final String INSERT_USER =
            "INSERT INTO consumer(name, password) VALUES (?, ?)";

    //language=SQL
    private static final String FIND_USER =
            "SELECT * FROM consumer WHERE name = ?";

    //language=SQL
    private static final String DELETE_USER =
            "DELETE FROM consumer WHERE id = ?";

    //language=SQL
    private static final String UPDATE_USER =
            "UPDATE consumer SET name = ? WHERE name = ?";

    private JdbcTemplate template;

    private RowMapper<Consumer> rowMapper = (resultSet, rowNum) -> {
        Consumer result = Consumer.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .password(resultSet.getString("password"))
                .build();
        return result;
    };

    public ConsumersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }


    @Override
    public void save(Consumer consumer) {
            template.update
                    (INSERT_USER, consumer.getPassword(), consumer.getName());
    }


    @Override
    public Consumer find(String name) {
        List<Consumer> result =
                template.query
                        (FIND_USER, rowMapper, name);
        if (result.size() > 0) {
            return (result.get(0));
        }
        return null;
    }

    @Override
    public void update(Consumer consumer) {
        template.update(UPDATE_USER);
    }

    @Override
    public void delete(Long id) {
        template.update
                (DELETE_USER, id);
    }

}

