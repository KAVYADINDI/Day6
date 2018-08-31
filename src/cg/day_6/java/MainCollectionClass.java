package cg.day_6.java;

import java.util.ArrayList;

import cg.day_6.que1.java.Car;
import cg.day_6.que1.java.CellPhone;
import cg.day_6.que1.java.Laptop;
import cg.day_6.que1.java.Television;
import cg.day_6.que2.java.School;

public class MainCollectionClass {
public static void main(String args[])
{
	ArrayList<Laptop> lp = new ArrayList<Laptop>(); 
	lp.add(new Laptop("Dell","I5","Windows","intel"));
	lp.add(new Laptop("Lenovo","I7","Linux","intel"));
	lp.add(new Laptop("Hp","I3","Mac","intel"));
	
	ArrayList<Car> cr = new ArrayList<Car>(); 
	cr.add(new Car("China","Hyundai",2007,650000));
	cr.add(new Car("US","Maruthi",2004,434000));
	cr.add(new Car("Europe","Tata",2000,560000));
	
	ArrayList<Television> tv = new ArrayList<Television>(); 
	tv.add(new Television("Samsung","LED","yes",30000));
	tv.add(new Television("Sony","Lcd","no",25000));
	tv.add(new Television("LG","Plasma","yes",43000));
	
	ArrayList<CellPhone> cp = new ArrayList<CellPhone>();
	cp.add(new CellPhone("Oppo","1.4","aaabbcc","Android",12000));
	cp.add(new CellPhone("Vivo","5.4","bbccaa","Android",10000));
	cp.add(new CellPhone("Iphone","6s","ccaaabb","Mac",20000));
	
	
	ArrayList<School> sl = new ArrayList<School>();
	sl.add(new School("Obul","hyd","rr",10));
	sl.add(new School("Swec","Sec","rr",60));
	sl.add(new School("bbvbs","vizag","ss",20));
	
	for(Laptop element : lp)
		System.out.println(element + "\n");
	System.out.println();
	
	for(Car element : cr)
		System.out.println(element + "\n");
	System.out.println();
	
	for(Television element : tv)
		System.out.println(element + "\n");
	System.out.println();
	
	for(CellPhone element : cp)
		System.out.println(element + "\n");
	System.out.println();
	
	for(School element : sl)
		System.out.println(element + "\n");
	System.out.println();
//	Laptop.printAll(lp);
	}
}
