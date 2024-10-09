package practice_java;

public class DateArr {

	public static void main(String[] args)
	{
		Date dd[] = new Date[2];
		
		dd[0] = new Date(1,"jan",2024);
		
		for(Date d:dd)
		{
			System.out.println(dd[0]);
		}
	}
	
}
