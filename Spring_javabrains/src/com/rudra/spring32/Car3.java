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

public class Car3 {
	private static Car3 car3;
	
	private Car3(){
		System.out.println("car3 obj created");
	}
	
	private static Car3 getInstance(){
		System.out.println("object is getting created via getInstance()");
		if(car3 == null){
			car3 = new Car3();
			return car3;
		}else{
			return car3;
		}
	}
	
	// this will make the object not to be cloned 
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}

	public void destroy(){
		// TODO Auto-generated method stub
		System.out.println("car3 destroy method invoked");
	}

	
	public void init()  {
		// TODO Auto-generated method stub
		System.out.println("car3 init method invoked");
		
	}
	
}