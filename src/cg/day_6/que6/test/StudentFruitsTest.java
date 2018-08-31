package cg.day_6.que6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.omg.Messaging.SyncScopeHelper;



class StudentFruitsTest {

	@Test
	void test() {
		///perform other operations too
		
		HashMap<String,ArrayList<String>> map = new HashMap<>();
		String[] favoriteFruits= new String [1];
		 favoriteFruits= new String [] {"orange","mango"};
		 map.put("kk", new ArrayList<>(Arrays.asList(favoriteFruits)));
	     favoriteFruits= new String [] {"mango","apple"};
	     map.put("rr", new ArrayList<>(Arrays.asList(favoriteFruits)));
		 favoriteFruits= new String [] {"apple","mango","orange"};
		 map.put("mm", new ArrayList<>(Arrays.asList(favoriteFruits)));
		 favoriteFruits= new String [] {"pear","apple"};
		 map.put("aa", new ArrayList<>(Arrays.asList(favoriteFruits)));
		 assertEquals(4,map.size());
		 System.out.println(map);
		 for (String string : map.keySet()) {
			 System.out.println(string);
			 System.out.println(map.get(string));
		}
		 
//		 for (Map.Entry me : map.entrySet()) {
//	          System.out.println("Key: "+me.getKey() + "     Value: " + me.getValue());
//	        }
//		 
//		 Iterator iterator = map.entrySet().iterator();
//	        while (iterator.hasNext()) {
//	             Map.Entry me2 = (Map.Entry) iterator.next();
//	          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
//	}
		 
}
	}
