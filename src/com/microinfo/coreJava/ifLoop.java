package com.microinfo.coreJava;

public class ifLoop {
	
	public static void main(String[]args){


	int i=55;
	String grade = "";
	
	if(i==100)
	{
	grade="A+";
	System.out.println("Out Standing");
	}
	else if (i>=90 && i<100)
	{
		grade="A";
		System.out.println("Excellent");
		
	}
	else if (i>=80 && i<90)
	{
		grade="B+";
		System.out.println("Very Good");
	}
	
	else if (i>=70 && i<80)
	{
		grade="B";
		System.out.println("Good");
	}
	else if (i>=60 && i<70)
	{
		grade="C";
		System.out.println("Passed");
	}
	else if (i<60)
	{
		grade="F";
		System.out.println("Failed");
	}
	
}
	}
