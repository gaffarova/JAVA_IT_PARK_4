import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "nemequittepas";

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);

        HumansDao humansDao = new HumansDaoJdbcTemplate(dataSource);
        humansDao.delete((long) 7);

        //HumanService service = new HumanService(humansDao);

        //Human human = Human.builder()
                //.name("Ryan")
                //.age(29)
                //.build();

        //service.registerUser(human);

        //CarsDao carsDao = new CarsDaoJdbcTemplate(dataSource);
        //CarService carService = new CarService(carsDao);

        //Car car = Car.builder()
                //.number("A123EC")
                //.model("A")
                //.build();
        //carService.registerCar(car);

    }
}
