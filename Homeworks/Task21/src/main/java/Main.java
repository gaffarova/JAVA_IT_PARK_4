import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

         ApplicationContext context =
                 new ClassPathXmlApplicationContext
                         ("context.xml");

        UsersDao dao = context.getBean(UsersDao.class);
        dao.find("Lion");



        }
    }




