import java.util.*;
class Admin 
{
	void m1(int a)
	{
		System.out.println("Method M1");
	}
	void m2(int a)
	{
		System.out.println("Method m2");
	}


	public static void main(String[] args) 
	{
	  Admin a = new Admin();
	  a.m1(10);
	  a.m2(20);
	}
}
