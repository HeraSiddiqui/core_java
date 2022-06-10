import java.util.*;
class  Over //Method Overloading
{
	void m1(int a)
	{
		System.out.println("Int m1 Method");
	}
	void m1(int a, int b)
	{
		System.out.println("Int m2 Method");
	}
    void m1(char ch)
	{
		System.out.println("Char m1 Method");
	}

	public static void main(String[] args) 
	{
		Over o=new Over();
		o.m1(10);
		o.m1(10,20);
		o.m1('A');
	}
}
