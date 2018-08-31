package cg.day_6.que1.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import cg.day_6.que1.java.Car;
import cg.day_6.que1.java.CellPhone;
import cg.day_6.que1.java.Laptop;
import cg.day_6.que1.java.Television;
import cg.day_6.que2.java.School;
import cg.day_6.que3.java.Names;

class MainCollectionClassTest {

	@Test
	void testCar() {
		ArrayList<Car> cr = new ArrayList<Car>();
		assertEquals(true, cr.add(new Car("China", "Hyundai", 2007, 650000)));
		assertEquals(true, cr.add(new Car("US", "Maruthi", 2004, 434000)));
		assertEquals(true, cr.add(new Car("Europe", "Tata", 2000, 560000)));
		assertEquals(3,cr.size());
		Car.printDetails(cr);
	}

	@Test
	void testTelevision() {
		ArrayList<Television> tv = new ArrayList<Television>();
		assertEquals(true, tv.add(new Television("Samsung", "LED", "yes", 30000)));
		assertEquals(true, tv.add(new Television("Sony", "Lcd", "no", 25000)));
		assertEquals(true, tv.add(new Television("LG", "Plasma", "yes", 43000)));
		assertEquals(3,tv.size());
		Television.printDetails(tv);
	}

	@Test
	void testLaptop() {
		ArrayList<Laptop> lp = new ArrayList<Laptop>();
		assertEquals(true, lp.add(new Laptop("Dell", "I5", "Windows", "intel")));
		assertEquals(true, lp.add(new Laptop("Lenovo", "I7", "Linux", "intel")));
		assertEquals(true, lp.add(new Laptop("Hp", "I3", "Mac", "intel")));
		assertEquals(3,lp.size());
		Laptop.printDetails(lp);
	}

	@Test
	void testCellPhone() {
		ArrayList<CellPhone> cp = new ArrayList<CellPhone>();
		assertEquals(true, cp.add(new CellPhone("Oppo", "1.4", "aaabbcc", "Android", 12000)));
		assertEquals(true, cp.add(new CellPhone("Vivo", "5.4", "bbccaa", "Android", 10000)));
		assertEquals(true, cp.add(new CellPhone("Iphone", "6s", "ccaaabb", "Mac", 20000)));
		assertEquals(3,cp.size());
		CellPhone.printDetails(cp);
	}

	@Test
	void testSchool() {
		ArrayList<School> sl = new ArrayList<School>();
		assertEquals(true, sl.add(new School("Obul", "hyd", "rr", 10)));
		assertEquals(true, sl.add(new School("Swec", "Sec", "rr", 60)));
		assertEquals(true, sl.add(new School("bbvbs", "vizag", "ss", 20)));
		assertEquals(3,sl.size());
		School.printDetails(sl);
	}

}
