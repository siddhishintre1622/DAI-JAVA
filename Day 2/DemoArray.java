package day2;
import day1.NewDate;

public class DemoArray {
	
	public static void main(String[] args)
	{

		int arr[] = {10,21,30,41,50};
		
		for(int i : arr)
		{
			if(i%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		
		
		
		NewDate[] dd = new NewDate[3];
		
		dd[0]=new NewDate();
		dd[1]=new NewDate();
		dd[2]=new NewDate();
		
		for(NewDate d : dd)
		{
			d.setDay(1);
		}
		
		for(NewDate d : dd)
		{
		System.out.println(	d.getDay());
		}
		
		
		

	}
	
}
