package practice_java;


class A
{
	int i = 10;
}

public class B  extends A{
	int i = 20;
	
	void show(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	public static void main(String[] args)
	{
		B b = new B();
		b.show(30);
//		System.out.println(this.i);
//		System.out.println(this.i);
	}

}
