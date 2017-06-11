package com.microinfo.coreJava;

public class computer {
	
	private int serialNo;
	private String model;
	private String processor;
	private String maker;
	private int ram;
	private int hardDrive;
	private boolean ssd;
	private int graphiCard;
	private boolean touchScreen;
	
	public void setSerialNo(int num){
		this.serialNo=num;
	}
	
	public int getSerialNo(){
		return serialNo;
	}
	
	
	public void setModel(String model){
		this.model=model;
	}
	
	public String getModel(){
		return model;
	}
	
	
	
	public void setProcessor(String p){
		this.processor=p;
	}
	
	public String getProcessor(){
		return processor;
	}
	
	
	public void setMaker(String maker){
		this.maker=maker;
	}
	
	public String getMaker(){
		return maker;
	}
	
	public void setRam(int ram){
		this.ram=ram;
	}
	
	public long getRam(){
		return ram;
	}
	
	public void setHardDrive(int harddrive){
		this.hardDrive=harddrive;
	}
	
	public int getHardDrive(){
		return hardDrive;
	}
	
	public void setSsd(boolean ssd){
		this.ssd=ssd;
	}
	
	public boolean hasSsd(){
		return this.ssd;
	}
	
	public void setGraphiCard(int graphicard ){
		this.graphiCard=graphicard;
	}
	
	public int getGraphiCard(){
		return graphiCard;
	}
	
	public void setTouchScreen(boolean touchscreen){
		this.touchScreen=touchscreen;
	}
	
	public boolean hasTouchScreen(){
		return this.touchScreen;
	}

}
