package collection;
import java.util.Set;
import java.util.HashSet;

public class SetDemo {
	
	public static void main(String [] args)
	{
		
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(1);
		s.add(2);
		
		System.out.println(s);
		
	}

}
