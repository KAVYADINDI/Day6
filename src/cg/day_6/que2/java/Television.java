package cg.day_6.que2.java;


import java.util.Objects;



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
	@Override
	public int hashCode(){
		return Objects.hash(company,type,price);
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
		
		Television c2=(Television) obj;
		return this.company==c2.company && this.type==c2.type && this.price==c2.price;
		
	}

	public String toString() {
		return company+" "+type+" 3d Enabled: "+enabled3d+" "+price;
	}

}
