package exception_handling;

public class Voting {
	
	public static void main(String[] args) throws MyException
	{
		int age = 16;
		try
		{
			if(age< 18)
			{
				throw new MyException("my msg");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
