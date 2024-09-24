package day1;
import java.math.*;
import java.lang.Math.*;

public class Math {
	
	public static int add(int a, int b)
	{
		return a+b;
	}

	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	
	public static void addition(int...num)
	{
		int res=0;
//		for(int i =0;i<num.length-1;i++)
//		{
//			res+=num[i];
//		}
//		System.out.println(res);
		
		for(int i :num)
		{
			res+=i;
		}
		System.out.println(res);
	}
	
	public static void main(String[] args)
	{
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		
		addition(1,2,3,4,5);
		addition(1,2,3,4);
		
		double a = java.lang.Math.abs(15);
		System.out.println(a);
	}
}
