import com.company.consumer.Consumer;
import com.company.consumer.ConsumersDao;
import com.company.consumer.ConsumersDaoHibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class ConsumerDaoTest {
    JdbcTemplate jdbcTemplate;
    ConsumersDao consumersDao;

    RowMapper<Consumer> rowMapper = (resultSet, rowNum) -> Consumer.builder()
            .id(resultSet.getLong("id"))
            .name(resultSet.getString("name"))
            .password(resultSet.getString("password"))
            .build();

    @Before
    public void setUp() {
        EmbeddedDatabase database = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("schema.sql")
                .addScript("data.sql")
                .build();
        jdbcTemplate = new JdbcTemplate(database);
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:hsqldb:mem:testdb");
        configuration.addAnnotatedClass(Consumer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        consumersDao = new ConsumersDaoHibernate(sessionFactory);
    }

    @Test
    public void save() {
        Consumer actual = Consumer.builder()
                .name("Александра")
                .password("1")
                .build();
        consumersDao.save(actual);
        //language=SQL
        Consumer expected = jdbcTemplate.queryForObject("SELECT * FROM consumer WHERE id = 4", rowMapper);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void find() {
        Consumer actual = consumersDao.find(2L);
        Consumer expected = Consumer.builder()
                .id(2L)
                .name("Евгения")
                .password("2468")
                .build();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void update() {
        //language=SQL
        Consumer actual = jdbcTemplate.queryForObject("SELECT * FROM consumer WHERE id = 2", rowMapper);
        Consumer expected = Consumer.builder()
                .id(2L)
                .name("Константин")
                .password("321")
                .build();
        consumersDao.update(expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void delete() {
        //language=SQL
        Consumer actual = jdbcTemplate.queryForObject("SELECT * FROM consumer WHERE id = 3", rowMapper);
        Consumer expected = Consumer.builder()
                .id(3L)
                .name("София")
                .password("000000")
                .build();
        consumersDao.delete(expected);
        Assert.assertEquals(actual, expected);
    }
}
