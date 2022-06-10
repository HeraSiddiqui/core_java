import java.util.*;
class Assg
{
	void m1()
	{
		System.out.println("m1 method");
	}
	void  m1(int a)
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args) 
	{
		Assg a= new Assg();
		a.m1();
	}
}
