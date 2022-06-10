import java.util.*;
class Akku
{
	int x=100;
	int y=200;
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(x+y);
	}
	public static void main(String[] args) 
	{
		Akku a=new Akku();
		a.add(1000,2000);
	}
}
