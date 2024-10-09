package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Test {

	
	public static void main(String[] args)
	{
		ArrayList l1 = new ArrayList();
		l1.add("Siddhi");
		l1.add("Shintre");
		l1.add(1);
		System.out.println(l1);
		
		HashSet hs = new HashSet();
		hs.add("Siddhi");
		hs.add("Shintre");
		hs.add(1);
		hs.add("A");
		hs.add("B");
		hs.add("Z");
		System.out.println(hs);
		
		HashMap hm = new HashMap();
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		System.out.println(hm);
		
		
		
		
	}
}
