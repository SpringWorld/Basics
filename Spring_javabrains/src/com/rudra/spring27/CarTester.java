package com.rudra.spring27;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTester {
 public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring27.xml");
	 Car car1 = (Car)context.getBean("carFac");
	/* Car car1 = (Car)context.getBean("car1");*/
	 car1.drive();
 }
}
