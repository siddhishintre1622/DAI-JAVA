package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	public static void main(String [] args)
	{
		
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(7);
		l.add(7);
		
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(l);
		
	}

}
