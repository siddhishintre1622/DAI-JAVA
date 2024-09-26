package day3;

import java.util.*;

public class Anagram {
		
	
	public static boolean anagram(String s1,String s2)
	{

		
		if (s1.length() != s2.length())
		{
			return false;
		}
		
		else
		{
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			
			char arr1[] = s1.toCharArray();
			char arr2[] = s2.toCharArray();
			
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2))
			{
				return true;
			}
		}
		
		
		return false;
		
	
	}
	
	
	
	public static void main(String[] args)
	{
	System.out.println(anagram("silent","listen"));
	}
}



















