package com.rudra.spring21;

import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Car {
	@Autowired
	@Qualifier("e1")
	private Engine engine;
	public void printData(){
		System.out.println("engine : "+engine.getModelYear());
	}
}
