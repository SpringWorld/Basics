package com.rudra.spring01;

public class Triangle {
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw()
	{
		System.out.println(getType()+ " triangle drawn");
	}
}
