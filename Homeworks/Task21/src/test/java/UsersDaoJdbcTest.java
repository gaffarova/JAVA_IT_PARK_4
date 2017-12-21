import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class UsersDaoIdbcTest {
    UsersDaoJdbcTemplateImpl usersDaoJdbcTemplate;

    @Before
    public void setUp() throws Exception {
        EmbeddedDatabase database = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("schema.sql")
                .addScript("data.sql")
                .build();
        usersDaoJdbcTemplate = new UsersDaoJdbcTemplateImpl(database);
    }

    @Test
    public void find() throws Exception {
        User actual = usersDaoJdbcTemplate.find("Lion");
        User expected = User.builder()
                .id(4L)
                .name("Lion")
                .password("12345")
                .build();

        Assert.assertEquals(expected, actual);
    }
}
