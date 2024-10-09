package practice_java;

class Tests
{
	int i;
	
	void setValue(int i )
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println(i);
	}
}

public class This {
	
	public static void main(String[] args)
	{
		Tests  t = new Tests();
		t.setValue(10);
		t.show();
	}

}
