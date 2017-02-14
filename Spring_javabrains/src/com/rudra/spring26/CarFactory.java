package com.rudra.spring26;

public class CarFactory {

	public static String carName;
	
	public void setCarName(String carName){
		this.carName = carName;
	}
	// non-static factory
	public Car getInstance() throws Exception{
		Car c = (Car) Class.forName(carName).newInstance();
		return c;
	}
}
