package collection;

import java.util.ArrayList;

public class Generics {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList();
		
		al.add(1);
		al.add(2);
		//al.add("siddhi");
		
		int m = (int) al.get(1);
		
		System.out.print(m);
		
		
		
	}

}
