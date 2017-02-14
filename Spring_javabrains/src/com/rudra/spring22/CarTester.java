package com.rudra.spring22;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTester {
 public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring22.xml");
	 Car car = (Car)context.getBean("car1");
	 car.printData();
 }
}
