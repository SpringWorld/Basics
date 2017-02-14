package com.rudra.spring29;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTester {
 public static void main(String[] args) {
	 // at the time of loading .. it will do Dependency injection and then invoke the init(afterPropertiesSet) method
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring29.xml");
	 Car car1 = (Car)context.getBean("car1");
	// to call the destroy method
	 context.close();
 }
}
