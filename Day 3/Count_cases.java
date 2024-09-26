package day3;

public class Count_cases {
	
	public static void cases(String s)
	{
		char arr[] = s.toCharArray();
		
		int upper =0;
		int lower=0;
		int spl=0;
		int digit = 0;
		
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(arr[i]))
			{
				upper++;
			}
			else if (Character.isLowerCase(arr[i]))
			{
				lower++;
			}
			else if(Character.isDigit(arr[i]))
			{
				digit++;
			}
			
			else
			{
				spl++;
			}
		}
		
		
		System.out.println("Upper : "+upper);
		System.out.println("Lower : "+lower);
		System.out.println(" Digit: "+digit);
		System.out.println("Special : "+spl);
	}
	
	
	
	public static void main(String[] args)
	{
		cases("Sid9#");
		cases("*****");
	}

}
