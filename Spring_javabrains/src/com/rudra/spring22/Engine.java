package com.rudra.spring22;

import org.springframework.stereotype.Component;


public class Engine {
	private String modelYear;
	public void setModelYear(String modelYear){
		this.modelYear = modelYear;
	}
	public String getModelYear() {
		return modelYear;
	}
}
