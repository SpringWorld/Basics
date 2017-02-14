package com.rudra.spring17;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class DrawingApp {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring17.xml");
	 	/*Shape shape = (Shape)context.getBean("triangle");
		shape.draw();*/
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting",null,"default greeting",null));
	}
}
