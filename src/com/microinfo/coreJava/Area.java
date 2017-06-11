package com.microinfo.coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	  ArrayList[] arrayOfArea= new ArrayList[4];
	  
	  System.out.println("Select a shape");
	  System.out.println("1:Circle");
	  System.out.println("2:Square");
	  System.out.println("3:Triangle");
	  System.out.println("4:Rectangle");
	  
	  System.out.println("Enter the value:");
	  Scanner scan = new Scanner(System.in);
	  int intShape = scan.nextInt();
	  
	  switch(intShape){
	  
	  case 1:
		  System.out.println("Enter the radius:");
		  double radius=scan.nextDouble();
		  
		  Shape circle = new Circle(radius);
		  double areaOfCircle = circle.area();
	      System.out.println("Area of circle " +areaOfCircle);
	      
		 break;
	  
	  
	  case 2: 
		  System.out.println("Enter the area:");
		  double lengthOfSide = scan.nextDouble();
		  
		  Shape square = new Square(lengthOfSide);
		  
		  double areaOfSquare = square.area();
		  System.out.println("Area of the square " +areaOfSquare);
	      break;
	      
	  case 3:
	  
		  System.out.println("Enter the height:");
		  double height = scan.nextDouble();
		  System.out.println("enter the base:");
		  double base = scan.nextDouble();
		  
		  Shape triangle = new Triangle(height, base);
		  double areaOfTriangle = triangle.area();
		  System.out.println("Area of triangle: " +areaOfTriangle);
	      break;
	  
	  case 4:
		  System.out.println("Enter the length:");
		  double length = scan.nextDouble();
		  System.out.println("Enter the breadth");
		  double breadth = scan.nextDouble();
		  
		  Shape rectangle = new Rectangle(length, breadth);
		  double areaOfRectangle = rectangle.area();
		 	
		  System.out.println("Area of rectangle: " +areaOfRectangle);
		  
		  break;
		  
     default:
    	 System.out.println("Invalid value");
    	 break;
		  		  		  
	  }		  
	  
	  scan.close();
		
	}


	
		
	
	
}

	      
	  
	
	  
     
      
      
      
      
      
      
      
     
      
      
      
      
      
      
      
      
      
      
      
     
      
      
     
      
      
      
      
      
	


