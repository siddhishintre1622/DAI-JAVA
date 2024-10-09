package Interface;

public interface MyInterface {

	
	int Myint = 5;
	void somemethod();
	
	
	public static void someStaticMethod()
	{
		System.out.println("Static method");
	}
	
	public default void someDefaultMethod()
	{
		System.out.println("Default method");
	}
}
