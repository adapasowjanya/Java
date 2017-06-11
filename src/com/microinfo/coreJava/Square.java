package com.microinfo.coreJava;

public class Square extends Shape{

	private double lengthOfSide;

	public Square(double lengthOfSide){
		this.lengthOfSide = lengthOfSide;
		
	}
	public double getLengthOfSide() {
		return lengthOfSide;
	}



	
	
	@Override
	public double area(){
		
		double areaOfSquare = 4 * lengthOfSide;
		
		return areaOfSquare;
		
	}
	
	
	
	

}
