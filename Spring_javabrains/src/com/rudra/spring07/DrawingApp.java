package com.rudra.spring07;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring07.xml");
		Triangle triangle = (Triangle)context.getBean("triangle1");
		//Triangle triangle = (Triangle)context.getBean("triangle2");
	//	Triangle triangle = (Triangle)context.getBean("triangle3");
		triangle.draw();
	}
}
