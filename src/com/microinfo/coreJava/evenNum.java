package com.microinfo.coreJava;

import java.util.Scanner;

public class evenNum {
public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	if(n%2==1){
		System.out.println("n is odd");
		
	}
	else
	{
		System.out.println("n is even");		
	}
}
}
