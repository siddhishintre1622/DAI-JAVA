


package Inheritance;

public class VIPMember extends Member {
	
	protected double annfee;
	private String name;
	private int id;
	private int since;
	private int discount;
	
	public VIPMember()
	{
		System.out.println("Parameterless constructor child class VIPMember");
	}
	
	public VIPMember(String name,int id,int discount)
	{
		super(name,id,discount);
	}
	
	@Override
	public void calculateAnnualFee()
	{
	annfee = (1-0.01*getDiscount())*1200;
	}


}
