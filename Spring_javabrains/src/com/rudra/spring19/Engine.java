package com.rudra.spring19;
public class Engine {
	private String modelYear;
	public Engine(){
		System.out.println("Engine object initialized");
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public String getModelYear() {
		return modelYear;
	}
}
