package accunt_ex;

public class Current extends Account{

	private int period;
	
	public Current(String name, String date, double amt, int period)
	{
		super(name,date,amt);
		this.period = period;
	}
	
	public double applyInterest()
	{
		double interest;
		
		interest = ((getAmt()*1*period)/100);
		return interest;
		
	}
	
}
