package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import service.HelloService;
import service.HelloServiceEnglishImpl;
import service.HelloServiceFactory;
import service.HelloServiceSpanishImpl;

@Configuration
public class HelloConfig {

	/**
	 * here we are using java profile configurations , this is a good approach 
	 * because may be most of the time you are using some 3rd party jars 
	 * and you don't have control over the source code...for annotation.
	 */
	@Bean
	public HelloServiceFactory helloServiceFactory(){
		return new HelloServiceFactory();
	}
	
	@Bean
	@Profile("english")
	public HelloService helloServiceEnglish(HelloServiceFactory helloServiceFactory){
		return helloServiceFactory.createHelloServiceImpl("en"); 
	}
	
	@Bean
	@Profile("spanish")
	public HelloService helloServiceSpanish(HelloServiceFactory helloServiceFactory	){
		return helloServiceFactory.createHelloServiceImpl("es"); 
	}
}
