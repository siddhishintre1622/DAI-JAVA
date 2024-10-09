package accunt_ex;

public abstract class Account {
	
	static int no=0;
	private int accno;
	private String name;
	private String date;
	private double amt;
	
	public  Account(String name,String date,double amt)
	{
		this.accno = ++no;
		this.accno = accno;
		this.name = name;
		this.date = date;
		this.amt = amt;	
	}
	
	public double getAmt()
	{
		return amt;
	}
	
	public String toString()
	{
		return "Account [ accno: "+accno+", name : "+ name+ "date : " + date + "amt : "+amt + "]";
	}
	
	public abstract double applyInterest();

}
