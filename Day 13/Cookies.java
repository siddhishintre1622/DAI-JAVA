package DessertShop;

public class Cookies extends Dessert{
	
	protected int qunatity;
	protected int price =10;
	protected int total;
	
	public Cookies(int qunatity)
	{
		this.qunatity = qunatity;
	}


	@Override
	public int calculatePrice() {
		this.total = qunatity*price;
		return 0;
	}

}
