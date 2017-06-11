package com.microinfo.coreJava;

import java.util.Scanner;

public class NumberSearch {

	public static void main(String[] args) {
		
		String[] str={"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scan.nextInt();
		
		
		System.out.println(str[num]);
			
		
			
		}

	}


