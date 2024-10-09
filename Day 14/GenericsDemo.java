package genericsDemo;

public class GenericsDemo {
	
	
	public static void main(String[] args)
	{
		MyGenericClass<Integer> mg = new MyGenericClass();
		mg.setMyVar(7,5);
		mg.printValu();
		
		
		MyGenericClass2<Integer> mg2 = new MyGenericClass2();
		MyGenericClass2<Double> mg3 = new MyGenericClass2();
		
	}

}
