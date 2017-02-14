package com.Spring.IOC1;

import java.util.Map;

public class Car {
	private String carName;
	private Engine[] engines;
	private Map carColor;
	public Car(){
		System.out.println("Car Obj created");
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	public void setCarColor(Map carColor) {
		this.carColor = carColor;
	}
	public void carDetails(){
		System.out.println("CarName : "+carName);
		for(Engine engine:engines){
			System.out.println("ModelYear : "+engine.getModelYear());
		}
		System.out.println("Available colors : "+carColor.toString());
	}
}
