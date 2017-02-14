package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.HelloService;

//@Controller
public class GreetingController {
private HelloService helloService;

	@Autowired
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
		
	public String greeting(){
		System.out.println(this.helloService.sayHello());
		return this.helloService.sayHello();
		}
}
