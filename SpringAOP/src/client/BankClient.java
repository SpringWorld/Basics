package client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;

public class BankClient {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cfg =  new ClassPathXmlApplicationContext("resources/aop.xml");
	
		Bank proxyBank = (Bank) cfg.getBean("pfb");
		
		/**
		 *  currently these services will execute for all method of the target class
		 *  in case if you don't want to execute these around few methods , use the POINTCUT 
		 *  classes.
		 *    
		 */
		int amount=proxyBank.deposite(5000, "sbi123");
		
		/**
		 * now we have applied pointcut condition on the deposite method alone , therefore
		 * these services won't execute for the findBalance method.
		 * 
		 * uncomment the section for testing
		 
			int amount=proxyBank.findBalance(5000, "sbi123");
		
		*/
		
		/**
		for testing the exceptional service uncomment this section
		int amount=proxyBank.deposite(5000, "sbi12");
		*/
		System.out.println(" Current amount : "+amount);
		cfg.close();
	}
}
