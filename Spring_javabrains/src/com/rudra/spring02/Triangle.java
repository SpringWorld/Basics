package com.rudra.spring02;

public class Triangle {
	private String type;
	private int height;
	public int getHeight() {
		return height;
	}
	public String getType() {
		return type;
	}
	public Triangle(String type) {
		this.type = type;
	}
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(String type,int height) {
		this.type = type;
		this.height=height;
	}
	public void draw()
	{
		System.out.println(getType()+ " triangle drawn of height"+getHeight());
	}
}
