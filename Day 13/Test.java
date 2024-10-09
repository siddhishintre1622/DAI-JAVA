package practice_java;

public class Test implements I1,I2
{

	public void show()
	{
		System.out.println("1");
	}
	
	public void display()
	{
		System.out.println("2");
	}
	
	
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.show();
		t.display();
	}

  
	
	
}
