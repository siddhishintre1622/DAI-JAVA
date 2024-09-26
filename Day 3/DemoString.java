package day3;

public class DemoString {

	
	public static void main(String[] args)
	{
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1+s2);
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.concat(s2));
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String n1 = "java";
		String n2 = "java";
		
		System.out.println(n1 == n2);
		
		System.out.println(n1+n2);
		
		System.out.println(n1.concat(n2));
		
		System.out.println(n1+ " Siddhi");
		
		String m = n1 + " Siddhi";
		System.out.println(m);
		
		
		
		
		
		
		
		
	}
}
