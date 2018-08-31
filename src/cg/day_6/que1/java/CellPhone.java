package cg.day_6.que1.java;

import java.util.ArrayList;

public class CellPhone {
private String company;
private String model;
private String description;
private String operatingSystem;
private double price;

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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getOperatingSystem() {
	return operatingSystem;
}

public void setOperatingSystem(String operatingSystem) {
	this.operatingSystem = operatingSystem;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public CellPhone() {
	super();
	// TODO Auto-generated constructor stub
}

public CellPhone(String company, String model, String description, String operatingSystem, double price) {
	super();
	this.company = company;
	this.model = model;
	this.description = description;
	this.operatingSystem = operatingSystem;
	this.price = price;
}

public String toString() {
	return company+" "+model+" "+description+" "+operatingSystem+" "+price;
}

public static void printDetails(ArrayList<CellPhone> cp) {
	// TODO Auto-generated method stub
	for (CellPhone cellPhone : cp) {
		System.out.println(cellPhone);
	}
	System.out.println("\n\n");
}
}
