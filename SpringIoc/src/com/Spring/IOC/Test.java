package com.Spring.IOC;

import java.rmi.registry.LocateRegistry;

public class Test {
	private String salutaion;
	//private String  name;
	public void setSalutation(String salutation) {
		this.salutaion = salutation;
	}
	public Test(){
		System.out.println("test constructor");
	}
	public Test(String salutation,String name,String location){
		this.salutaion=salutation;
		init(name,location);
	}
	public Test(String salutation,int secretAgentCode,String location){
		this.salutaion=salutation;
		init("i"+(secretAgentCode+100),location);
	}
	public void init(String name,String location){
		System.out.println("Welcome , "+salutaion+" "+name+ "[from : "+location+" ]");
		
	}
}
