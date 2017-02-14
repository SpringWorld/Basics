package com.rudra.spring14;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class DrawingApp {
	public static void main(String[] args) {
	/*	
		[using the BeanFactory]
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	*/
	/*
	 * [using ApplicationContext]  => you have to move the spring.xml in the classpath (here moved to the src directory)
	 */
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring14.xml");
		/*Shape shape = (Shape)context.getBean("triangle");
		shape.draw();*/
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
	}
}
