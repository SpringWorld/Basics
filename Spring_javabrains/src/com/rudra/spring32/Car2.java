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

public class Car2 {
	private static Car2 car2;
	
	private Car2(){
		System.out.println("car2 obj created");
	}
	
	private static Car2 getInstance(){
		System.out.println("object is getting created via getInstance()");
		if(car2 == null){
			car2 = new Car2();
			return car2;
		}else{
			return car2;
		}
	}
	
	// this will make the object not to be cloned 
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}

	public void destroy(){
		// TODO Auto-generated method stub
		System.out.println(" car 2 destroy method invoked");
	}

	
	public void init()  {
		// TODO Auto-generated method stub
		System.out.println(" car 2 init method invoked");
		
	}
	
}
