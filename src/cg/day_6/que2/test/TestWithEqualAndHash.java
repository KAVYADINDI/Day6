package cg.day_6.que2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import cg.day_6.que2.java.Car;
import cg.day_6.que2.java.CellPhone;
import cg.day_6.que2.java.Laptop;
import cg.day_6.que2.java.School;
import cg.day_6.que2.java.Television;

class TestWithEqualAndHash {

	@Test
	void testCar() {
		HashSet<Car> cr = new HashSet<Car>();
		assertEquals(true, cr.add(new Car("China", "Hyundai", 2007, 650000)));
		assertEquals(true, cr.add(new Car("US", "Maruthi", 2004, 434000)));
		assertEquals(false, cr.add(new Car("China", "Hyundai", 2000, 560000)));
		assertEquals(2, cr.size());
	}

	@Test
	void testTelevision() {
		HashSet<Television> tv = new HashSet<Television>();
		assertEquals(true, tv.add(new Television("Samsung", "LED", "yes", 30000)));
		assertEquals(false, tv.add(new Television("Samsung", "LED", "no", 30000)));
		assertEquals(true, tv.add(new Television("LG", "Plasma", "yes", 43000)));
		assertEquals(2, tv.size());
	}

	@Test
	void testLaptop() {
		HashSet<Laptop> lp = new HashSet<Laptop>();
		assertEquals(true, lp.add(new Laptop("Dell", "D5555", "Windows", "i7")));
		assertEquals(false, lp.add(new Laptop("Dell", "D5555", "Linux", "i5")));
		assertEquals(false, lp.add(new Laptop("Dell", "D5555", "Mac", "i3")));
		assertEquals(1, lp.size());
	}

	@Test
	void testCellPhone() {
		HashSet<CellPhone> cp = new HashSet<CellPhone>();
		assertEquals(true, cp.add(new CellPhone("Oppo", "1.4", "aaabbcc", "Android", 12000)));
		assertEquals(false, cp.add(new CellPhone("Oppo", "1.4", "bbccaa", "Android", 10000)));
		assertEquals(true, cp.add(new CellPhone("Iphone", "6s", "ccaaabb", "Mac", 20000)));
		assertEquals(2, cp.size());
	}

	@Test
	void testSchool() {
		HashSet<School> sl = new HashSet<School>();
		assertEquals(true, sl.add(new School("Obul", "hyd", "rr", 10)));
		assertEquals(true, sl.add(new School("Swec", "Sec", "rr", 60)));
		assertEquals(false, sl.add(new School("Obul", "hyd", "rr", 20)));
		assertEquals(2, sl.size());
	}
}
