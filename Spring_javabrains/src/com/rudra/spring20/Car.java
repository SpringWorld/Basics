package com.rudra.spring20;

import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String location;
	private Vector carNames;
	private TreeSet carModels;
	private Hashtable carColors;
	private Properties drivers;
	private Properties driversFromFile;
	private Engine engine;
	
	public Car(){
		System.out.println("car object initialized");
	}
	public void setCarNames(Vector carNames) {
		this.carNames = carNames;
	}
	public void setCarModels(TreeSet carModels) {
		this.carModels = carModels;
	}
	public void setCarColors(Hashtable carColors) {
		this.carColors = carColors;
	}
	public void setDrivers(Properties drivers) {
		this.drivers = drivers;
	}
	public void setDriversFromFile(Properties driversFromFile) {
		this.driversFromFile = driversFromFile;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printData(){
		System.out.println(carModels.toString()+"\n"+carColors.toString());
		for(Object carName : carNames){
			System.out.print(carName+"\t");
		}
		System.out.println("location : "+location);
		System.out.println("modelYear : "+engine.getModelYear());
		System.out.println("Drivers : "+drivers.toString());
	System.out.println("Drivers From File : "+driversFromFile.toString());
	}
}
