package day1;

public class Students {

	private static int rollno=0;
	private String name=null;
	
	public Students(String name)
	{	
		rollno+=1;
		this.name = name;
	}
	
	public String toString()
	{
		return this.name + " " + rollno;
	}
	public static void main(String[] args)
	{
		Students s = new Students("Siddhi");
		System.out.println(s);
		
		Students s1 = new Students("Sonal");
		System.out.println(s1);
	}
		
	
}
