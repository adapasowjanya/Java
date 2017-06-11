package com.practice.coreJava;

import java.util.Scanner;

public class LinearSearch {

	private static int[] arr;

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int num=scan.nextInt();
		
		int array[] =new int[num];
		
		
		System.out.println("Enter" +num+ "integers");
		for(int i=0;i<num;i++){
		int arr=scan.nextInt();		
		
	}
		System.out.println("enter search number:");
		int num1=scan.nextInt();
				
					for(int i=0;i<num;i++){
						if(array[i]==num1){
							
							System.out.println("Found");
							break;
							
						}
					
							
					
					if(array[i]==num){
						
						System.out.println("Not found");
					
					}
					}
	}
	
		
	
	}

		
		
		/*for(int i=0;i<=num-1;i++){
			
			int array[i]=scan.nextInt();
			System.out.println("enter the search value:");
			int item=scan.nextInt();
			
			for(int j=0;j<num;j++){
				if(array[j]==item){
					System.out.println("number is present");
					break;
				}
			}
			 if(i==num){
				 System.out.println("number not present");
			 }
		}

	}

}*/
