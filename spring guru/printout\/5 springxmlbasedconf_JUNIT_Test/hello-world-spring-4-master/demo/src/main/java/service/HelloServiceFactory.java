package service;

public class HelloServiceFactory {

	public HelloService createHelloServiceImpl(String language){
		HelloService helloService = null;
		switch(language){
		case("en"): helloService = new HelloServiceEnglishImpl();
					break;
		case("es"):	helloService =  new HelloServiceSpanishImpl();
					break;
		case("de"):	helloService =  new HelloServiceGermanImpl();
					break;
		default : 	helloService =  new HelloServiceEnglishImpl();
					break;		
		
		}
			return helloService;
	}
}
