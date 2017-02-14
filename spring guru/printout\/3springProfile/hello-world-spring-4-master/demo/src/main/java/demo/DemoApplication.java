package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.HelloServiceEnglishImpl;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        /**
         *  when there are more than one implementation , use profile for decision making.
         *  update application.properties
         *  
         *  let us make english a default one 
         *  @profile("default") : makes implementation default .
         *  in cases 
         *  spring.profiles.active=spanish given then spanish will override the default profile.
         *  
         *  many profiles can be given to the same implementation
         *  @profile({"default","english"}) 
	
         */
        
        InjectedByConstructorService injectedByConstructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        injectedByConstructorService.greeting();
        
        InjectedBySetterMethod injectedBySetterMethod = (InjectedBySetterMethod ) ctx.getBean("injectedBySetterMethod");
        injectedBySetterMethod.greeting();
    }
}
