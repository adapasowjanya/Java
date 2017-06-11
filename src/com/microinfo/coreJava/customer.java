package com.microinfo.coreJava;

public class customer {
	
    private int id;
    private String firstName;
	private String lastName;
	private String gender;
	private long phone;
	private String email;
	private int ssn;
	private int zip;
	private String country;
	
	
	
	public void setid(int id){
		this.id=id;
	}
	
	public int getid(){
		return id;
	}
	
	
	public void setfirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getfirstName(){
		return firstName;
	}
	
	
	
	public void setlastName(String lastName){
		this.lastName=lastName;
	}
	
	public String getlastName(){
		return lastName;
	}
	
	
	public void setGender(String gender){
		this.gender=gender;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setphone(long phone){
		this.phone=phone;
	}
	
	public long getPhone(){
		return phone;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setSsn(int ssn){
		this.ssn=ssn;
	}
	
	public int getSsn(){
		return ssn;
	}
	
	public void setZip(int zip){
		this.zip=zip;
	}
	
	public int getZip(){
		return zip;
	}
	
	public void setCountry(String country){
		this.country=country;
	}
	
	public String getCountry(){
		return country;
	}
	

}
