package com.microinfo.coreJava;

import java.util.Scanner;

public class StringsArray {

	public static void main(String[] args) {
		
		String[] firstName= {"sowjanya","sruthi","kumari"};
		
		String[] lastName= {"adapa","oruganti","adapa"};
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter FirstName");
		String name=scan.nextLine();
		boolean result=false;
		
		
		for(int i=0; i<=firstName.length-1;i++){
					
		if (name.equals(firstName[i])){
			result=true;
			System.out.println(firstName[i]+" "+lastName[i]);
		}
									
					}
		if(result == false){	
				System.out.println("No result");
			}
		}
		
		
		
		
		}
		
	
	
	


		
	


		

	


