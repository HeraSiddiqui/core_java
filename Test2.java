import java.util.*;  //Method example 1
class Test2
{
	void m1()
	{
		System.out.println("m1 method");
	}
	static void m2()
	{
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) 
	{
		Test2 t=new Test2();
		t.m1();
		Test2.m2();
	}
}
