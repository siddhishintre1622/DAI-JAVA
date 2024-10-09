package DessertShop;

public class IceCreams extends Dessert {

	

	protected int qunatity;
	protected int price =10;
	protected int total;
	
	public IceCreams(int qunatity)
	{
		this.qunatity = qunatity;
	}


	@Override
	public int calculatePrice() {
		this.total = qunatity*price;
		return 0;
	}
}
