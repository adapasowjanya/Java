package com.microinfo.coreJava;

public class switchStatement {
	public static void main(String[]args){
		int i=95;
		String grade="";
		if(i==100)
		{
		grade="A+";
		
		}
		else if (i>=90 && i<100)
		{
			grade="A";
		
		}
				else if (i>=80 && i<90)
		{
					grade="B+";
			
		}
		
		else if (i>=70 && i<80)
		{
			grade="B";
		}
		else if (i>=60 && i<70)
		{
			grade="C";
					}
		else if (i<60)
		{
			grade="F";
					}
		
		
		switch(grade){
		
		case "A+":
			
			{
	
				System.out.println("Out Standing");
				break;
			}
			
			
		case "A" :
					{
			System.out.println("Excellent");
			break;
		}
		
		case "B+" :
			
		{
			System.out.println("Very Good");
			break;
		}
		
		case "B" :
					{
			System.out.println("Good");
			break;
		}
		
		case "C":
			
		{
			System.out.println("Passed");
			break;
		}
		
		case "F":
			
		{
			System.out.println("Failed");
			break;
		}
			
		
		
		}
	}

}
