package com.microinfo.coreJava;

public class Triangle extends Shape {
	
	private double height;
	private double base;
	
	public Triangle(double height, double base){
		this.height = height;
		this.base = base;
		
	}
	public double getHeight() {
		return height;
	}
	
	public double getBase() {
		return base;
	}
	
	
	@Override
	public double area(){
		
		double areaOfTriangle = 0.5 * base * height;
		return areaOfTriangle;
	}
	
	
	

}
