package day4;

public class Car {

	private String make;
	private String model;
	private int price;
	
	public Car(String make, String model, int price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object other)
	{
		 Car o = (Car) other;
		 
		 if((this.make.equals(o.make)) && (this.model.equals(o.model)) && (this.price ==o.price))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	}
	
	
   
	
	
}
