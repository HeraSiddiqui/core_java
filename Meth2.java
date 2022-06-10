import java.util.*;
class Meth2 
{
	Emp m1()
	{
		System.out.println("M1 Method");
		Emp e=new Emp();                        // if the method return type is object just create the object and return it with the ref object example here is e.
		return e;                               //No need to write the whole thing just e would do.
		//return new Emp();
	
	}

	X m2()
	{
       System.out.println("M2 Method");
	   X  x=new X();
	   return x;
	   // return new X();
	}
    
	static String m3()
	{
		System.out.println("M3 Method");
		return "Hera";

	}

	public static void main(String[] args) 
	{
		Meth2  m= new Meth2();
		Emp e= m.m1();
		System.out.println(e);
		X x= m.m2();
		System.out.println(x);
        String str=Meth2.m3();
        System.out.println(str);
	}
}
