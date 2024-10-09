package accunt_ex;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Accounttester {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		List<Account> accounts = new ArrayList();
		
		while(true)
		{
			System.out.println(" 1 for Savings \n 2 for Current \n 3 for Deposit ");
			System.out.println("Enter choice : ");
			int choice = sc.nextInt();
			
			System.out.println("Enter name : ");
			String name = sc.next();
			
			System.out.println("Enter date : ");
			String date= sc.next();
			
			System.out.println("Enter amount : ");
			double amount= sc.nextDouble();
			
			System.out.println("Enter time : ");
			int period = sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				accounts.add(new Savings(name,date,amount,period));
				System.out.print("savings account added");
				break;
			
			case 2:
				accounts.add(new Current(name,date,amount,period));
				System.out.print("current account added");
				break;
				
			case 3:
				accounts.add(new Deposit(name,date,amount,period));
				System.out.print("deposit account added");
				break;
			
			}
			
			for(Account i : accounts)
			{
				System.out.println(i);
				System.out.println("interst : " + i.applyInterest());
			}
		}
		
		
	}

}
