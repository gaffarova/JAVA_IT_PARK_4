import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class HumanDataStorage {

    //language=SQL
    private static final String SQL_INSERT_USER =
            "INSERT INTO owner(name, age) VALUES (?, ?)";

    //language=SQL
    private static final String SQL_GET_BY_ID =
            "SELECT * FROM owner WHERE id = ?";

    JdbcTemplate jdbcTemplate;

    public HumanDataStorage(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void add(Human human) {
        jdbcTemplate.update
                (SQL_INSERT_USER, human.getName(), human.getAge());
    }

    public Human getById(int id) {
        return jdbcTemplate.queryForObject
                (SQL_GET_BY_ID, new HumanRowMapper(), id);
    }



}
