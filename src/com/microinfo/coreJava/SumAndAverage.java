package com.microinfo.coreJava;

public class SumAndAverage {
	public static void main(String[]args){
		double sum=0;
		for(int i=1;i<=100;i++){
			sum=sum+i;
		}
		System.out.println("Sum of the number:" +sum);
		
		double average=sum/100;
		System.out.println("Average is: " +average);

		
	}

}
