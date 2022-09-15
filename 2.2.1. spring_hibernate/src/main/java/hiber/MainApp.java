package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      Car car1 = new Car("ferrari", 784517);
      Car car2 = new Car("lada", 445698);
      Car car3 = new Car("toyota", 955559);

      userService.add(new User("Inna", "Lastname1", "user1@mail.ru", car3));

      context.close();
   }
}
