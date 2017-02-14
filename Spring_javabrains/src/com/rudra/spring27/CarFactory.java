package com.rudra.spring27;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean{

	public static String carName;
	
	public void setCarName(String carName){
		this.carName = carName;
	}
	/*// non-static factory
	public Car getInstance() throws Exception{
		Car c = (Car) Class.forName(carName).newInstance();
		return c;
	}*/
	@Override
	public Object getObject() throws Exception {
		Car c = (Car) Class.forName(carName).newInstance();
		return c;
	}
	@Override
	public Class getObjectType() {
			return Car.class;
	}
	@Override
	public boolean isSingleton() {
			return false;
	}
}
