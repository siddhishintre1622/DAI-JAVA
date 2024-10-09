package accunt_ex;



public class Deposit extends Account{

	private int period;
	
	public Deposit(String name, String date, double amt, int period)
	{
		super(name,date,amt);
		this.period = period;
	}
	
	public double applyInterest()
	{
		double interest;
		
		interest = ((getAmt()*8*period)/100);
		return interest;
		
	}
	
}

