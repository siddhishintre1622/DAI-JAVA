package Inheritance;
import java.util.*;

public abstract class Member {
	
	protected double annfee;
	private String name;
	private int id;
	private int since;
	private int discount;
	
	public Member()
	{
		System.out.println("Parameterless constructor parent class Member");
	}
	
	public Member(String name,int id,int discount)
	{
		this.name = name;
		this.id = id;
		this.since = since;
	}
	
	public int getDiscount()
	{
		return discount;
	}
	
	public void setDiscount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password :");
		String password = sc.next();
		
		
		if(password.equals("abcde"))
		{
			System.out.println("Enter Discount :");
			discount = sc.nextInt();
		}
		else
		{
			System.out.println("Invalid password");
		}
	}
	
	public abstract void calculateAnnualFee();
	
	
	public void displayMemInfo(){
		System.out.println("Member Name: " + name);
		System.out.println("Member ID: " + id);
		System.out.println("Member Since " + since);
		System.out.println("Annual Fee: " + annfee);
		}
	

}
