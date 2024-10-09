package Interface;

public class InterfaceDemo {
	
	public static void main(String[] args)
	{
		MyClass m = new MyClass();
		
		m.somemethod();
		
		System.out.println(MyInterface.Myint);
		MyInterface.someStaticMethod();
		m.someDefaultMethod();
	}

}
