package com.microinfo.coreJava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		
		int sum=0;
		while(num!=0){
		
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		
		
		}
		if(sum>9){
			num=sum;
			sum=0;
			while(num!=0){
				
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			
		}
		
				
		System.out.println("Sum of digits:"+sum);
		
		
		
		
		
		
		

	}

}
