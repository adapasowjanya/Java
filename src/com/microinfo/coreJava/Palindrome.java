package com.microinfo.coreJava;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
        
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String str1=scan.nextLine();
		
		String str2="";
		
		char[] str1chr= new char[str1.length()];
		 
		str1chr=str1.toCharArray();
		int len=str1.length();
		
		for(int i=len-1;i>=0;i--){
			str2 = str2 + str1chr[i];
		}
		
		scan.close();
				
				
		
		if(str1.equals(str2)){
			System.out.println("its palindrome");
		}
			else
			{
				System.out.println("its not a  palindrome");
				
			}
		}
	

}
