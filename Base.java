import java.util.*;
class Base
{
	int a=100;
	int b=200;
	void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}

	public static void main(String[] args) 
	{
		Base b=new Base();
		b.add(10,20);
		
	}
}
