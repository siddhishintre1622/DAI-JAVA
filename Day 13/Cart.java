package DessertShop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	
	static int totalPrice =0;
	
	static List<Dessert> ds = new ArrayList();
	
	Dessert d;
	public void addToCart(Dessert d)
	{
		ds.add(d);
	}
	
	public int tPrice()
	{
		 totalPrice += d.calculatePrice();
		 
		 return totalPrice;
	}

}
