import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    private static final String URL =  "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "nemequittepas";

    public static void main(String[] args) {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
        dataSource.setDriverClassName("org.postgresql.Driver");

        HumanDataStorage storage = new HumanDataStorage(dataSource);

        Human human = new Human("София", 25);

        storage.add(human);
        System.out.println(storage.getById(15));
    }
}
