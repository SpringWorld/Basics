package com.Spring.IOC1;
public class Engine {
	private String modelYear;
	public Engine(){
		System.out.println("Engine Obj created");
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
}
