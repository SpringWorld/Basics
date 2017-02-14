package com.rudra.spring32;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTester {
 public static void main(String[] args) {
	 // at the time of loading .. it will do Dependency injection and then invoke the init(afterPropertiesSet) method
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring32.xml");

	 Car car1 = (Car)context.getBean("car1");
	 Car2 car2 = (Car2)context.getBean("car2");
	 Car3 car3 = (Car3)context.getBean("car3");
	 Car4 car4 = (Car4)context.getBean("car4");
	 context.close();
 }
}
