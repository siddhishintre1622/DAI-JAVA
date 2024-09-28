package day5;

import java.util.*;

/*

public class Accounts {
	
	static int balance = 1000;
	static int attempt = 0;
	
	public static void deposit(int n) throws IncorrectDenominationException
	{
		if(n%100 !=0)
		{
			throw new IncorrectDenominationException();
		}
		else
		{
			System.out.println("Deposited"  );
		}
	}
	
	public static void withdraw(int n) throws InsufficientFundException, TransactionLimitExceededException
	{
		attempt +=1;
		if(n> balance)
		{
			throw new InsufficientFundException();
		}
		
		if(attempt <=3)
		{
			throw new TransactionLimitExceededException();
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int amt = sc.nextInt();
		
		
		try
		{
			deposit(amt);
			withdraw(amt);
			
		}
		catch ( IncorrectDenominationException |InsufficientFundException |  TransactionLimitExceededException  e)
		{
			System.out.println(e.getMessage());
		}
	}

		

}
*/


public class Accounts
{
	
	static int balance = 1000;
	static int attempt = 0;
	
	public static void deposit(int n) throws IncorrectDenominationException
	{
		if(n%100 !=0)
		{
			throw new IncorrectDenominationException();
		}
		else
		{
			System.out.println("Deposited : " + ( balance+n)  );
		}
	}
	
	
	public static void withdraw(int n) throws InsufficientFundException, TransactionLimitExceededException
	{
		attempt +=1;
		
		
		if(attempt >3)
		{
			throw new TransactionLimitExceededException();
		}
		else
		{
			if(n> balance)
			{
				throw new InsufficientFundException();
			}
			else
			{
				balance = balance -n;
				System.out.println(" Balance : " + balance);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
		
		String choice ;
		System.out.println("Enter ypur choice : ");
		choice = sc.next();
		
		if(choice.equals("deposit") )
		{
			int amt ; 
			 System.out.println("Enter amount to deposit : ");
			 amt = sc.nextInt();
			
			 try
			 {
				 
				 deposit(amt);
				 System.out.println(" deposited");
			 }
			 catch (IncorrectDenominationException e)
			 {
				 System.out.println(e.getMessage());
			 }
		}
		
		else if (choice.equals("withdraw"))
		{
			try
			{
				 int amt ; 
				 System.out.println("Enter amount to withdraw : ");
				 amt = sc.nextInt();
				 withdraw(amt);
			}
			catch (TransactionLimitExceededException e)
			{
				System.out.println(e.getMessage());
			} 
			
			catch (InsufficientFundException e)
			{
				
				System.out.println(e.getMessage());
			}
		}
	}
	}



}

