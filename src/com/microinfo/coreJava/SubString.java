package com.microinfo.coreJava;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String: ");
		
	String str=scan.nextLine();
	
	System.out.println("Enter a position: ");
	int position=scan.nextInt();
	
	if(position>str.length()-1){
		System.out.println("Index Out of Bound");
	}
	else{
		System.out.println(str.charAt(position));	
	}
//		
//		System.out.println("Enter substring len: ");
//		int len=scan.nextInt();
//		
//		for(int i=0; i<=str.length()-len;i++){
//			System.out.println(str.substring(i, i+len));
//		}


		
	}
	
}
