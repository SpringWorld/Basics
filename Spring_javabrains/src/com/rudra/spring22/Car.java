package com.rudra.spring22;

import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="car1")
public class Car {
	@Autowired
	@Qualifier("e1")
	private Engine engine;
	
	public void printData(){
		System.out.println("engine : "+engine.getModelYear());
		
	}
}
