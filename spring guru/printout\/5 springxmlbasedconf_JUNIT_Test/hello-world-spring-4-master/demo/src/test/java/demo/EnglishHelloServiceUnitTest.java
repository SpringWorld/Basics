package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/spring/spring-config.xml","classpath:/spring/english-helloservice-config.xml"})
public class EnglishHelloServiceUnitTest {

	@Autowired
	HelloService helloService;
	
	@Test
	public void testHelloWorld(){
		String greeting = helloService.sayHello();
		assertEquals("Hello World!!",greeting);
	}
}
