package com.microinfo.coreJava;

public class Circle extends Shape{
	
	private double radius;
	private final double pi = 3.14;
		
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double area(){
		
		double areaOfCircle = pi * Math.pow(radius, 2);
		return areaOfCircle;
		
	}
}
