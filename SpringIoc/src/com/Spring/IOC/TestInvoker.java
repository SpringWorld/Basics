package com.Spring.IOC;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestInvoker {

	public static void main(String[] args){
	ApplicationContext apc =  new ClassPathXmlApplicationContext("resources/spring.xml");
	Test t1 = (Test) apc.getBean("test");
	t1.init("rudra","IN");
	}
}
