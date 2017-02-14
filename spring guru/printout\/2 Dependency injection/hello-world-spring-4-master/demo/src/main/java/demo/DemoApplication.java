package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.HelloServiceImpl;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        InjectedByConstructorService injectedByConstructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        injectedByConstructorService.greeting();
        
        InjectedBySetterMethod injectedBySetterMethod = (InjectedBySetterMethod ) ctx.getBean("injectedBySetterMethod");
        injectedBySetterMethod.greeting();
    }
}
