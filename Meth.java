import java.util.*;    //Method Example 2
class Meth
{
	void m1(int a,char ch)
	{
		System.out.println("m1 method");
        System.out.println(a);
		System.out.println(ch);
	}

	static void m2(String str, double d)
	{
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		Meth m= new Meth();
		m.m1(10,'A');
		Meth.m2("Hera",10.5);

	}
}
