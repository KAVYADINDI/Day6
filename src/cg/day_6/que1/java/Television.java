package cg.day_6.que1.java;

import java.util.ArrayList;

public class Television {
private String company;
private String type;
private String enabled3d;
private double price;

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getEnabled3d() {
	return enabled3d;
}

public void setEnabled3d(String enabled3d) {
	this.enabled3d = enabled3d;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Television() {
	super();
	// TODO Auto-generated constructor stub
}

public Television(String company, String type, String enabled3d, double price) {
	super();
	this.company = company;
	this.type = type;
	this.enabled3d = enabled3d;
	this.price = price;
}

public String toString() {
	return company+" "+type+" 3d Enabled: "+enabled3d+" "+price;
}

public static void printDetails(ArrayList<Television> tv) {
for (Television television : tv) {
	System.out.println(television);
}
System.out.println("\n\n");
		
	}
}

