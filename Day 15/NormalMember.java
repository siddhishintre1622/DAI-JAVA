package Inheritance;

public class NormalMember extends Member {
	
	protected double annfee;
	private String name;
	private int id;
	private int since;
	private int discount;
	
	public NormalMember()
	{
		System.out.println("Parameterless constructor child class NormalMember");
	}
	
	public NormalMember(String name,int id,int discount)
	{
		super(name,id,discount);
	}
	
	@Override
	public void calculateAnnualFee()
	{
	annfee = (1-0.01*discount)*(100 + 12*30);
	}


}
