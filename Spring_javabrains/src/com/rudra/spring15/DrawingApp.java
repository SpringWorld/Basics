package com.rudra.spring15;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	
	public static void main(String[] args) {
	
	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring15.xml");
	 context.registerShutdownHook();
		/*Shape shape = (Shape)context.getBean("triangle");
		shape.draw();*/
		
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
	}
}
