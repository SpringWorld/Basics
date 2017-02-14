package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedBySetterMethod {

	private HelloService helloService;
	
	@Autowired
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
	public void greeting(){
		this.helloService.sayHello();
	}
}
