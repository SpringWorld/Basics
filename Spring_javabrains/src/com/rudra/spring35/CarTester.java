package com.rudra.spring35;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTester {
 public static void main(String[] args) {
	 // at the time of loading .. it will do Dependency injection and then invoke the init(afterPropertiesSet) method
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring35.xml");
	 Car car1 = (Car)context.getBean("car1");
	
	 car1.printData();
	 context.close();
 }
}
