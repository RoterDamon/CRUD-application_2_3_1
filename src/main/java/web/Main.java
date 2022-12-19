package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        User user = new User("Nastya", "Pupuk", "email@gmail.com");
        UserService service = context.getBean(UserService.class);
        service.saveUser(user);*/
    }
}