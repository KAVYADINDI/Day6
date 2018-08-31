package cg.day_6.que1.java;

import java.util.ArrayList;

public class Laptop {
private String company;
private String model;
private String operatingSystem;
private String processor;


public String getCompany() {
	return company;
}


public void setCompany(String company) {
	this.company = company;
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public String getOperatingSystem() {
	return operatingSystem;
}


public void setOperatingSystem(String operatingSystem) {
	this.operatingSystem = operatingSystem;
}


public String getProcessor() {
	return processor;
}


public void setProcessor(String processor) {
	this.processor = processor;
}


public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}


public Laptop(String company, String model, String operatingSystem, String processor) {
	super();
	this.company = company;
	this.model = model;
	this.operatingSystem = operatingSystem;
	this.processor = processor;
}


public String toString() {
	return company+" "+model+" "+operatingSystem+" "+processor;
}


public static void printDetails(ArrayList<Laptop> lp) {
	// TODO Auto-generated method stub
	for (Laptop laptop : lp) {
		System.out.println(laptop);
	}
	System.out.println("\n\n");
}
	
}

