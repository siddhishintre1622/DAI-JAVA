package day2;
import java.util.*;
public class Store {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String choice = sc.next()
;		
		
		Flavour flavour = Flavour.valueOf(choice.toUpperCase());
		
		switch(flavour)
		{
		
		case CHOCOLATE:
			System.out.println("Selected "+flavour);
			break;
			
		case MINT:
			System.out.println("Selected "+flavour);
			break;
			
		case CREAM:
			System.out.println("Selected "+flavour);
			break;
		
		}
		
	}
	

}
