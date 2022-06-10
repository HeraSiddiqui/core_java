import java.util.*;
class Appu
{
	int x=90;
	int z=20;
	void sub(int p, int q)
	{
		System.out.println(x-z);
		System.out.println(p-q);
	}
	public static void main(String[] args) 
	{
		Appu a=new Appu();
		a.sub(200,100);
	}
}
