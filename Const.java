import java.util.*;
class Const
{
	void m1()
	{
		System.out.println(" MAIN METHOD");
	}
	Const() //constructor
	{
		System.out.println("0 args const");
	}
	Const(int a)
	{
		System.out.println("Args const");
	}
	public static void main(String[] args)
	{
		Const c=new Const();
		Const c1=new Const(10);
		c.m1();
		c1.m1();
	}


}













//import java.util.*;
//class Const 
//{
//	void m1()
//	{
//		System.out.println("M1 Method");
//	}
//	public static void main(String[] args) 
//	{
//		Const c= new Const();
//		c.m1();
//	}
//}
