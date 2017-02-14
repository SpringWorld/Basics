package com.rudra.spring13;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class DrawingApp {
	public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring13.xml");
		Shape shape = (Shape)context.getBean("triangle");
		shape.draw();
		shape = (Shape)context.getBean("circle");
		shape.draw();
	}
}
