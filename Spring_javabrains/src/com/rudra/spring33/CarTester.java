package com.rudra.spring33;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTester {
 public static void main(String[] args) {
	 // at the time of loading .. it will do Dependency injection and then invoke the init(afterPropertiesSet) method
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring33.xml");
	 Car car = (Car)context.getBean("car");
	 Bus bus = (Bus)context.getBean("bus");
	 Truck truck = (Truck)context.getBean("truck");
	 
	 System.out.println(car.myCarEngine().getEngineName());
	 System.out.println(bus.myBusEngine().getEngineName());
	 System.out.println(truck.myTruckEngine().getEngineName());
	 
	 
	 context.close();
 }
}
