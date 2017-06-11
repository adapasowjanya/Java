package com.microinfo.coreJava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CustomersFromTextFile {

	public static void main(String[] args) throws IOException {

				FileInputStream file= new FileInputStream("C:/Users/Sowji/JavaEclipse/CoreJava/src/com/microinfo/coreJava/customerdata.txt");
				InputStreamReader input = new InputStreamReader(file);
				BufferedReader br = new BufferedReader(input);
				
				ArrayList<CustomerTextFile> customerArray = new ArrayList<>();
				
				while(br.readLine() != null){
				int userId = Integer.valueOf(br.readLine());
				String firstName = br.readLine();
				String lastName = br.readLine();
				int age = Integer.valueOf(br.readLine());
				long phone = Long.valueOf(br.readLine());
				int zip = Integer.valueOf(br.readLine());
				double height = Double.valueOf(br.readLine());
				double weight = Double.valueOf(br.readLine());
				String city = br.readLine();
					
				CustomerTextFile customer = new CustomerTextFile(userId, firstName, lastName, age,phone,zip,height,weight,city);
				
				customerArray.add(customer);
				
				}
				
				for(int i=0;i<customerArray.size();i++){
					
					System.out.println("======Customer Data======");
					CustomerTextFile customer = customerArray.get(i);
					
					System.out.println(customer.getUserId());
					System.out.println(customer.getFirstName());
					System.out.println(customer.getLastName());
					System.out.println(customer.getAge());
					System.out.println(customer.getPhone());
					System.out.println(customer.getZip());
					System.out.println(customer.getHeight());
					System.out.println(customer.getWeight());
					System.out.println(customer.getCity());
				}
				
				br.close();
				
				
				
				
	}
	
}