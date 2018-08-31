package cg.day_6.que1.java;

import java.util.ArrayList;
public class School {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String toString() {
		return name + " " + city + " " + schoolDistrict + " " + greatSchoolRanking;
	}

	public static void printDetails(ArrayList<School> sl) {
		// TODO Auto-generated method stub
		for (School school : sl) {
			System.out.println(school);

		}
		System.out.println("\n\n");
	}
}
