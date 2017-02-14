package com.rudra.spring24;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTester {
 public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring24.xml");
	 Car car1 = (Car)context.getBean("car1");
	 Car car2 = (Car)context.getBean("car1");
	 System.out.println(car1==car2);
 }
}
