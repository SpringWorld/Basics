package com.rudra.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
	 * [without spring the initiation]
	 *
	 * Triangle triangle = new Triangle();	
		[using the BeanFactory]
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
[using ApplicationContext]  => you have to move the spring.xml in the classpath 
(here moved to the src directory)
	 */
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring01.xml");
	
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
