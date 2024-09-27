package day4;

public class DemoObjectMethods {

	public DemoObjectMethods() {
		super();
	}

	
	public static void main(String[] args)
	{
		Car c1 = new Car("aa","bb",10000);
		Car c2 = new Car("aa","bb",10000);
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
