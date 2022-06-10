import java.util.*;
class Abb 
{
	int a=10;// 2 Instance variables
	int b=20; 
    static int c=30; //2 Static variables
	static int d=40;
	void m1()              //instance var
	{
      System.out.println(a);
	  System.out.println(b);
	  System.out.println(Abb.c);
	  System.out.println(Abb.d);
	}
	static void m2()             //Static var
	{
		Abb a=new Abb();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(Abb.c);
		System.out.println(Abb.d);
	}
	public static void main(String[] args) 
	{
		Abb a= new Abb();
		a.m1();
		Abb.m2();
	}
}
