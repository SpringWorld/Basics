package demo;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 3/11/15.
 */
@Component
public class HelloServiceImpl implements HelloService{
    public void sayHello(){
        System.out.println("Hello World!!!!");
    }
}
