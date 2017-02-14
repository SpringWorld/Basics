package com.rudra.spring36;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTester {
 public static void main(String[] args) {
	 // at the time of loading .. it will do Dependency injection and then invoke the init(afterPropertiesSet) method
	 // for handling the lifeCycle and event handling we should use "ConfigurableApplicationContext" container
	 
	 // at the time of loading it calls the refresh events.
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring36.xml");
	 
	 
	 
	 context.start();
	 context.stop();
	 
	 // shutdown event
	 context.close();
	 
	 // it means restarting the IOC container
	 context.refresh();
 }
}
