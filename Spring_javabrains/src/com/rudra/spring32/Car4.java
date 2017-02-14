package com.rudra.spring32;

import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Car4 {
	private static Car4 car4;
	
	private Car4(){
		System.out.println("car4 obj created");
	}
	
	private static Car4 getInstance(){
		System.out.println("object is getting created via getInstance()");
		if(car4 == null){
			car4 = new Car4();
			return car4;
		}else{
			return car4;
		}
	}
	
	// this will make the object not to be cloned 
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}

	public void destroy(){
		// TODO Auto-generated method stub
		System.out.println("car4 destroy method invoked");
	}

	
	public void init()  {
		// TODO Auto-generated method stub
		System.out.println("car4 init method invoked");
		
	}
	
}
