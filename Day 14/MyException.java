package exception_handling;

public class MyException extends Exception{
	
	public MyException()
	{
		super("Under age !");
	}
	
	
	
	public MyException(String s)
	{
		super(s);
		System.out.println("My Exception");
	}
	
	

}
