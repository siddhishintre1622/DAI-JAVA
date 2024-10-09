package genericsDemo;

public class  MyGenericClass<T> {
	
	private T myVar;
	private int m;
	
	void setMyVar( T i,int k)
	{
		myVar =i;
		m=k;
	}
	
	
	
	void printValu()
	{
		System.out.println(myVar);
		System.out.println(m);
	}

}
