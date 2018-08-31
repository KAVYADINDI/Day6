package cg.day_6.que1.java;

import java.util.ArrayList;

import cg.day_6.que3.java.Names;

public class Car {
private String make;
private String model;
private int year;
private double price;

public Car() {
	super();
	// TODO Auto-generated constructor stub
}

public Car(String make, String model, int year, double price) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.price = price;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
public static void printDetails(ArrayList<Car> car) {
	for (Car car2 : car) {
		System.out.println(car2);
	}
	System.out.println("\n\n");
}

public String toString() {
	return make+" "+model+" "+year+" "+price;
}
}
