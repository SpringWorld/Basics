package com.rudra.spring30;

import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeSet;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

public class Car {
	private static Car car;
	
	private Car(){
		System.out.println("car obj created");
	}
	
	private static Car getInstance(){
		System.out.println("object is getting created via getInstance()");
		if(car == null){
			car = new Car();
			return car;
		}else{
			return car;
		}
	}
	
	// this will make the object not to be cloned 
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	@PreDestroy
	public void destroy(){
		// TODO Auto-generated method stub
		System.out.println("@PreDestory : destroy method invoked");
	}

	@PostConstruct
	public void initMethod()  {
		// TODO Auto-generated method stub
		System.out.println("@PostConstruct : init method invoked");
		
	}
	
}
