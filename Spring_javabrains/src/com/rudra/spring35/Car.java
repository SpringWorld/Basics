package com.rudra.spring35;

public class Car {
	private String driver,url,user,password;

	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void printData(){
		System.out.println("Driver : "+driver);
		System.out.println("Url : "+url);
		System.out.println("User : "+user);
		System.out.println("Password : "+password);
	}
}
