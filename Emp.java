import java.util.*;
class Emp 
{
	int a=10;
	int b=20; //2instance var
	static void m1()
	{
		Emp e=new Emp();
		System.out.println(e.a);
		System.out.println(e.b);
	}
	static void m2()
	{
       Emp e=new Emp();
	   System.out.println(e.a);
	   System.out.println(e.b);
	}

    public static void main(String[] args)
	{
     Emp.m1();
     Emp.m2();
     }
}




	  
	 
	  
	//  Demo d2=new Demo();
	