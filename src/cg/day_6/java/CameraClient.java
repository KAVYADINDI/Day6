package cg.day_6.java;

import java.util.HashSet;
import java.util.TreeSet;

public class CameraClient {
public static void main (String args [])
{
//	HashSet<Camera> products = new HashSet<>();
//	products.add(new Camera("NK234",35000,"nikon"));
//	products.add(new Camera("CN234",25000,"cannon"));
//	products.add(new Camera("NK234",35000,"nikon"));

	
	TreeSet<Camera> products = new TreeSet<>();
	products.add(new Camera("NK234",35000,"NIKON"));
	products.add(new Camera("CN234",25000,"CANNON"));
	products.add(new Camera("NK334",25000,"NIKON"));
	products.add(new Camera("SN234",21000,"SONY"));
	products.add(new Camera("KD234",13000,"KODAK"));
	
	for(Camera c: products)
	{
		System.out.println(c);//c.hashCode()-for printing the hashCode.
	}
}
}