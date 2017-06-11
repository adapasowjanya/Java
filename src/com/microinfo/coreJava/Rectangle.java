package com.microinfo.coreJava;

public class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	
	public Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	
	
	
	
	public double getBreadth() {
		return breadth;
	}

	
	
	@Override
	public double area(){
		
		double areaOfRectangle= length * breadth;
		
		return areaOfRectangle;
	}
	
	
	
	
	

}
