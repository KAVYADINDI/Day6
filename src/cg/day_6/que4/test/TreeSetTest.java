package cg.day_6.que4.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import cg.day_6.que4.java.Names;

class TreeSetTest {

	@Test
	void test() {
		TreeSet<Names> name = new TreeSet<Names>();
		
		assertEquals(true,name.add(new Names("Fill",100067,"ECE")));
		assertEquals(true,name.add(new Names("Ema",10047,"CSE")));
		assertEquals(true,name.add(new Names("Jack",100058,"IT")));	
		assertEquals(true,name.add(new Names("Jill",10024,"EEE")));
		assertEquals(true,name.add(new Names("Tom",10056,"EIE")));
		assertEquals(5,name.size());
		for(Names n: name)
		{
			System.out.println(n);
		}
	}

}
