package service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 3/11/15.
 */
public class HelloServiceEnglishImpl implements HelloService{
    public String sayHello(){
        return "Hello World!!";
    }
}
