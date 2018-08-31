package cg.day_6.que3.test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import cg.day_6.que3.java.Names;

class ClassNameCollectionTest {

	@Test
	void Nametest() {
		ArrayList<Names> name = new ArrayList<Names>();
	
		assertEquals(true,name.add(new Names("Fill",100067,"ECE")));
		assertEquals(true,name.add(new Names("Ema",10047,"CSE")));
		assertEquals(true,name.add(new Names("Jack",100058,"IT")));	
		assertEquals(true,name.add(new Names("Jill",10024,"EEE")));
		assertEquals(true,name.add(new Names("Tom",10056,"EIE")));
		Names.printName(name);
		assertEquals(5,name.size());
	}

}
