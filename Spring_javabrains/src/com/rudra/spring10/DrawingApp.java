package com.rudra.spring10;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class DrawingApp {
	public static void main(String[] args) {
	/*Lifecycle callbacks
		 * 	spring provides the methods(callbacks) which gets executed at the start of the bean and once they are destroyed.
		 * 	in order to close the context object , we have to use the AbstractApplicationContext class
		 *  * [using the AbstractApplicationContext]=>
		 * * AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring08.xml");
		*/
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");
		// here we are registering the shutdown Hook , so that the destroy() can be executed 
		context.registerShutdownHook();
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
