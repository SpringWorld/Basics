package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.HelloService;

@Controller
public class GreetingController {
private HelloService helloService;
	
	@Autowired
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
	public void greeting(){
		this.helloService.sayHello();
	}
}
