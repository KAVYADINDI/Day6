package cg.day_6.java;

import java.util.Objects;

public class Camera implements Comparable<Camera> {
private String model;
private double price;
private String brand;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Camera(String model, double price, String brand) {
	super();
	this.model = model;
	this.price = price;
	this.brand = brand;
}
public Camera() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public boolean equals(Object obj)
{
	if(this==obj)
		return true;
	
	if(obj==null)
		return false;
	
	if(this.getClass()!=obj.getClass())
		return false;
	
	//Object obj = new Camera(); hence need to do down casting
	Camera c2=(Camera) obj;
	return this.brand==c2.brand && this.model==c2.model && this.price==c2.price;
	
}
 //java7(ObjectsClass)
public int hashCode(){
return Objects.hash(brand,price,model);
}
@Override//Alt s s s Enter Enter -shortcut keys
public String toString() {
	return "Camera [model=" + model + ", price=" + price + ", brand=" + brand + "]";
}
@Override
public int compareTo(Camera c2) {
	//comparission based on price
	int result=Double.compare(this.price, c2.price);
	if(result==0)
	return	this.model.compareTo(c2.model);
//	double price1=this.price;
//	double price2=c2.price;
//	if(price1<price2)
//		return -1;
//	if(price1>price2)
//		return 1;
//	if(price1==price2)
//		return 0;
	
//	
	
	return result;
}
}
