import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class ConsumerDaoJdbcTest {
    ConsumersDaoJdbcTemplateImpl consumersDaoJdbcTemplate;

    @Before
    public void setUp() throws Exception {
        EmbeddedDatabase database = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("schema.sql")
                .addScript("data.sql")
                .build();
        consumersDaoJdbcTemplate = new ConsumersDaoJdbcTemplateImpl(database);
    }

    @Test
    public void find() throws Exception {
        Consumer actual = consumersDaoJdbcTemplate.find("Евгения");
        Consumer expected = Consumer.builder()
                .id(2L)
                .name("Евгения")
                .password("2468")
                .build();

        Assert.assertEquals(expected, actual);
    }
}
