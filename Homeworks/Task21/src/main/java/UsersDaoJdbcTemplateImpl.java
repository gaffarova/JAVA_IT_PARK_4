import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class UsersDaoJdbcTemplateImpl implements UsersDao<User> {

    //language=SQL
    private static final String INSERT_USER =
            "INSERT INTO user(name, password) VALUES (?, ?)";

    //language=SQL
    private static final String FIND_USER =
            "SELECT * FROM user WHERE name = ?";

    //language=SQL
    private static final String DELETE_USER =
            "DELETE FROM user WHERE id = ?";

    //language=SQL
    private static final String UPDATE_USER =
            "UPDATE user SET name = ? WHERE name = ?";

    private JdbcTemplate template;

    private RowMapper<User> rowMapper = (resultSet, rowNum) -> {
        User result = User.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .password(resultSet.getString("password"))
                .build();
        return result;
    };

    public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }


    @Override
    public void save(User user) {
            template.update
                    (INSERT_USER, user.getPassword(), user.getName());
    }


    @Override
    public User find(String name) {
        List<User> result =
                template.query
                        (FIND_USER, rowMapper, name);
        if (result.size() > 0) {
            return (result.get(0));
        }
        return null;
    }

    @Override
    public void update(User user) {
        template.update(UPDATE_USER);
    }

    @Override
    public void delete(Long id) {
        template.update
                (DELETE_USER, id);
    }

}

