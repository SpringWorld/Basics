package com.rudra.spring34;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MethodReplacerTester {
 public static void main(String[] args) {
	 // at the time of loading .. it will do Dependency injection and then invoke the init(afterPropertiesSet) method
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring34.xml");
	 Bank bank = (Bank)context.getBean("bank");
	// to call the destroy method
	 bank.deposit();
	 bank.withdraw();
	 bank.calculateInterest();
	 context.close();
 }
}
