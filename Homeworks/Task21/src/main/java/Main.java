import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

         ApplicationContext context =
                 new ClassPathXmlApplicationContext
                         ("context.xml");

        ConsumersDao dao = context.getBean(ConsumersDao.class);
        System.out.println(dao.find("Евгения"));



        }
    }




