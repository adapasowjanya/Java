package com.microinfo.coreJava;

public class Arrays1 {

	public static void main(String[] args) {
		
		
		String[] str=new String[4];
		str[0]="Harish";
		str[1]="sowjanya";
		str[2]="kumari";
		str[3]="sruthi";
		
		int len=str.length;
				
		for(int i=len-1; i>=0;i--){
			
			System.out.println(str[i]);
		}

	}

}
