package com.rudra.spring06;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring06.xml");
			Triangle triangle = (Triangle)context.getBean("triangle1");
			triangle.draw();
	}
}
