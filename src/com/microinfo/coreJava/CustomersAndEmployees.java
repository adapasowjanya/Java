package com.microinfo.coreJava;

public class CustomersAndEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers person1=new Customers();
		person1.setUserId(1);
		person1.setFirstName("sowjanya");
		person1.setLastName("Adapa");
		person1.setHeight(5);
		person1.setPhone(2345645234l);
		person1.setAge(25);
		person1.setAddress1("456 Hickory Mills circle");
		person1.setAddress2("Not Mentioned");
		person1.setCity("Kent");
		person1.setZip(44240);
		person1.setCountry("USA");
		
	
		Customers person2=new Customers();
		person2.setUserId(2);
		person2.setFirstName("sruthi");
		person2.setLastName("Adapa");
		person2.setHeight(5);
		person2.setPhone(2345671234l);
		person2.setAge(25);
		person2.setAddress1("418 Hickory Mills circle");
		person2.setAddress2("Not Mentioned");
		person2.setCity("Kent");
		person2.setZip(44240);
		person2.setCountry("USA");
		
	
		Customers person3=new Customers();
		person3.setUserId(3);
		person3.setFirstName("sandeep");
		person3.setLastName("kumar");
		person3.setHeight(5);
		person3.setPhone(2346771234l);
		person3.setAge(25);
		person3.setAddress1("418 Hickory Mills circle");
		person3.setAddress2("Not Mentioned");
		person3.setCity("Kent");
		person3.setZip(44240);
		person3.setCountry("USA");
		
		
		Customers person4=new Customers();
		person4.setUserId(4);
		person4.setFirstName("harish");
		person4.setLastName("kurma");
		person4.setHeight(5);
		person4.setPhone(2345891234l);
		person4.setAge(25);
		person4.setAddress1("418 Hickory Mills circle");
		person4.setAddress2("Not Mentioned");
		person4.setCity("Kent");
		person4.setZip(44240);
		person4.setCountry("USA");
		
		
		Customers person5=new Customers();
		person5.setUserId(5);
		person5.setFirstName("kumari");
		person5.setLastName("Adapa");
		person5.setHeight(5);
		person5.setPhone(2345671234l);
		person5.setAge(25);
		person5.setAddress1("418 Hickory Mills circle");
		person5.setAddress2("Not Mentioned");
		person5.setCity("Kent");
		person5.setZip(44240);
		person5.setCountry("USA");
		
		Customers[] customerArray=new Customers[5];
		customerArray[0]=person1;
		customerArray[1]=person2;
		customerArray[2]=person3;
		customerArray[3]=person4;
		customerArray[4]=person5;
		
		System.out.println("===========CUSTOMERS==================");
		
		for(int i=0;i<customerArray.length;i++){
			Customers person=customerArray[i];
			
			System.out.println("====================================");
			
			System.out.println(person.getUserId());
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getHeight());
			System.out.println(person.getPhone());
			System.out.println(person.getAge());
			System.out.println(person.getAddress1());
			System.out.println(person.getAddress2());
			System.out.println(person.getCity());
			System.out.println(person.getCountry());
			System.out.println(person.getZip());
			

			
			
		}
		
		System.out.println("===========EMPLOYEES==================");

		
		Employees employee1=new Employees();
		employee1.setUserId(1);
		employee1.setFirstName("sowjanya");
		employee1.setLastName("Adapa");
		employee1.setHeight(5);
		employee1.setWeight(45.67);
		employee1.setSalary(100.45);
		employee1.setPhone(2345671234l);
		employee1.setAge(25);
		employee1.setAddress1("418 Hickory Mills circle");
		employee1.setAddress2("Not Mentioned");
		employee1.setCity("Kent");
		employee1.setZip(44240);
		employee1.setCountry("USA");
		
		
		Employees employee2=new Employees();
		employee2.setUserId(2);
		employee2.setFirstName("sruthi");
		employee2.setLastName("Adapa");
		employee2.setHeight(5);
		employee2.setWeight(45.67);
		employee2.setSalary(100.45);
		employee2.setPhone(2345671234l);
		employee2.setAge(25);
		employee2.setAddress1("418 Hickory Mills circle");
		employee2.setAddress2("Not Mentioned");
		employee2.setCity("Kent");
		employee2.setZip(44240);
		employee2.setCountry("USA");
		
		
		Employees employee3=new Employees();
		employee3.setUserId(3);
		employee3.setFirstName("john");
		employee3.setLastName("tim");
		employee3.setHeight(5);
		employee3.setWeight(45.67);
		employee3.setSalary(100.45);
		employee3.setPhone(2345671234l);
		employee3.setAge(25);
		employee3.setAddress1("418 Hickory Mills circle");
		employee3.setAddress2("Not Mentioned");
		employee3.setCity("Kent");
		employee3.setZip(44240);
		employee3.setCountry("USA");
		
		Employees employee4=new Employees();
		employee4.setUserId(4);
		employee4.setFirstName("jack");
		employee4.setLastName("albert");
		employee4.setHeight(5);
		employee4.setWeight(45.67);
		employee4.setSalary(100.45);
		employee4.setPhone(2345671234l);
		employee4.setAge(25);
		employee4.setAddress1("418 Hickory Mills circle");
		employee4.setAddress2("Not Mentioned");
		employee4.setCity("Kent");
		employee4.setZip(44240);
		employee4.setCountry("USA");
		
		
		Employees employee5=new Employees();
		employee5.setUserId(5);
		employee5.setFirstName("jim");
		employee5.setLastName("thomson");
		employee5.setHeight(5);
		employee5.setWeight(45.67);
		employee5.setSalary(100.45);
		employee5.setPhone(2345671234l);
		employee5.setAge(25);
		employee5.setAddress1("418 Hickory Mills circle");
		employee5.setAddress2("Not Mentioned");
		employee5.setCity("Kent");
		employee5.setZip(44240);
		employee5.setCountry("USA");
		
		Employees[] employeeArray=new Employees[5];
		employeeArray[0]=employee1;
		employeeArray[1]=employee2;
		employeeArray[2]=employee3;
		employeeArray[3]=employee4;
		employeeArray[4]=employee5;
		
		for(int i=0;i<employeeArray.length;i++){
			Employees employee=employeeArray[i];
			
			System.out.println(employee.getUserId());
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getHeight());
			System.out.println(employee.getWeight());
			System.out.println(employee.getSalary());
			System.out.println(employee.getPhone());
			System.out.println(employee.getAge());
			System.out.println(employee.getAddress1());
			System.out.println(employee.getAddress2());
			System.out.println(employee.getCity());
			System.out.println(employee.getCountry());
			System.out.println(employee.getZip());
			

			System.out.println("====================================");
		}
		
		for(int i=0;i<customerArray.length;i++){
			String fName1=customerArray[i].getFirstName();
			String lName1=customerArray[i].getLastName();
			 for(int j=0; j<employeeArray.length;j++){
				 String fName2=employeeArray[j].getFirstName();
				 String lName2=employeeArray[j].getLastName();
				 
				 if((fName1==fName2) && (lName1==lName2)){
					 System.out.println("Customer " + fName1 + " is also our employee");
				 }
			 }
			
		}
		
		
		
		
		
		
	}

}
