package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {

	private HelloService helloService;
	
	@Autowired
	public InjectedByConstructorService(HelloService helloService){
		this.helloService = helloService;
	}
	
	public void greeting(){
		this.helloService.sayHello();
	}
}
