package demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 3/11/15.
 */
@Component
@Profile("spanish")
public class HelloServiceSpanishImpl implements HelloService{
    public void sayHello(){
        System.out.println("Hola mundo!!!!");
    }
}
