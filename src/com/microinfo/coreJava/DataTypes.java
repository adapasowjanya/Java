package com.microinfo.coreJava;

public class DataTypes {

	public static void main(String[] args) {
		int myMinValue=-2147483648;
		System.out.println("Min value if int is:" +myMinValue);
		int myMaxValue=2147483647;
		System.out.println("Max value if int is:" +myMaxValue);
		
		{
		byte minValue=-128;
		System.out.println("Min value if byte is:" +minValue);
		byte maxValue=127;
		System.out.println("Max value if byte is:" +maxValue);
		}
		
		
		{
		float minVal=-3.4e38f;
		System.out.println("Min value if float is:" +minVal);
		float maxVal=3.4e38f;
		System.out.println("Max value if float is:" +maxVal);
		}
		
		{
			double x=-1.7e308d;
			System.out.println("Min value if double is:" +x);
			double y=1.7e308d;
			System.out.println("Max value if double is:" +y);
			
		}
		
		{
		short a=-32768;
		System.out.println("Min value if short is:" +a);
		short b=32767;
		System.out.println("Max value if short is:" +b);
		}
		
		{
		long a1=-2^63l;
		System.out.println("Min value if long is:" +a1);
		long b1=2^63-1l;
		System.out.println("Max value if long is:" +b1);
		}
		
		{
		char ch='S';
		System.out.println("Min value if char is:" +ch);
		char ch1='s';
		System.out.println("Max value if char is:" +ch1);
		}
		
		{
		boolean x1=true;
		if(x1==false)
			System.out.println("condition is true");
		else
			System.out.println("condition is false");
		}
		
	}

}
