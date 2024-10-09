package collection;
//import java.util.*;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args)
	{
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		
		for(Object o : al)
		{
			System.out.print(o + " ");
		}
		
		System.out.println(al.get(0));
		
		ArrayList al1 = new ArrayList();
		al1.add("a");
		al1.add("b");
		
		al.add(al1);
		
		System.out.println(al.add(500));
		
		System.out.println(al.contains(500));
		System.out.println(al.contains("f"));
		
		System.out.println(al.isEmpty());
		
		
		al.remove(al.indexOf(500));
		al.remove(al1);
		//al.removeAll(al);
		al.clear();
		
		
		
		System.out.println(al);
		
		
		
		
		
	}

}
