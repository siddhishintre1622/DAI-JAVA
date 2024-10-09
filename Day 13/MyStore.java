package DessertShop;
import java.util.Iterator;
import java.util.Scanner;

public class MyStore {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		System.out.println("Welcome to the Store ");
		System.out.println("****************************************");
		
		Cart mycart = new Cart();
		
		while(true)
		{
			System.out.println("Enter type : ");
			String type = sc.next();
			
			System.out.println("Enter quantity : ");
			int q = sc.nextInt();
			
			
			
			
			
			switch(type)
			{
			case "Cookies":
				Cookies cook = new Cookies(q);
				mycart.addToCart(cook);
				System.out.println("Total price of " + type +  ":" +  cook.total);
				break;
			
			case "Candies":
				Candies can = new Candies(q);
				mycart.addToCart(can);
				System.out.println("Total price of " + type +  ":" +  can.total);
				break;
				
			case "IceCreams":
				IceCreams ice = new IceCreams(q);
				mycart.addToCart(ice);
				System.out.println("Total price of " + type +  ":" +  ice.total);
				break;	
				
			}
			System.out.println("Total items in Cart: " + count);
			System.out.println("Total Bill : " + mycart.totalPrice);
			System.out.println("_______________________________");
			
		}
		
		
	}

}
