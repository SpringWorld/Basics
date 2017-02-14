package springbootclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import controllers.GreetingController;

@SpringBootApplication
@ComponentScan({"service","controllers","config"})
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
              
        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.greeting();
    }
}
