import java.util.*;
class Nodes
{
	 Nodes m1()
	{
		 System.out.println("M1 Method");
		 Nodes n=new Nodes();
		 return n;
		 //return new Nodes();
	}
	Nodes m2()
	{
		 System.out.println("M2 Method");
         return this;
	}
	public static void main(String[] args) 
	{
		Nodes  n1 =new Nodes();
		Nodes  n2 =n1.m1();
		Nodes  n3 =n1.m2();
	}
}
