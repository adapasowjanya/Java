package com.microinfo.coreJava;

public class CustomerTextFile {
	
	    private int userId;
	    private String firstName;
		private String LastName;
		private int age;
		private long phone;
		private int zip;
		private double height;
		private double weight;
		private String city;
		
		
		public CustomerTextFile(int userId, String firstName, String lastName, int age, long phone, int zip,double height, double weight, String city){
			this.userId = userId;
			this.firstName = firstName;
			this.LastName = lastName;
			this.age = age;
			this.phone = phone;
			this.zip = zip;
			this.height = height;
			this.weight = weight;
			this.city = city;
		}
		
		public int getUserId() {
			return userId;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return LastName;
		}
		
		public int getAge() {
			return age;
		}
		
		public long getPhone() {
			return phone;
		}
		
		public int getZip() {
			return zip;
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public String getCity() {
			return city;
		}
		
		
		
		
		
		
		
		
		
		

}
