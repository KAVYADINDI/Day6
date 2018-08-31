package cg.day_6.que2.java;

import java.util.Objects;

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
	@Override
	
	public int hashCode(){
		return Objects.hash(model,company);
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
		Laptop c2=(Laptop) obj;
		return this.model==c2.model && this.company==c2.company;
		
	}


	public String toString() {
		return company+" "+model+" "+operatingSystem+" "+processor;
	}
		
}
