package com.rudra.spring02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
	 * [without spring the initiation]
	 * 
	 * Triangle triangle = new Triangle();
	 */	
	/*	[using the BeanFactory]
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	*/
	/*[using ApplicationContext]  => you have to move the spring.xml in the classpath (here moved to the src directory)
	 */
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring02.xml");
	
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
