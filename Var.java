import java.util.*;
class Var 
{
	int a=100;//instance variable
	int b=200;
	public static void main(String[] args) //static method
	{//static area
		Var v=new Var();
		System.out.println(v.a);
		System.out.println(v.b);
		v.m1();
	}
	//instance method
void m1()
  {//instance area
	System.out.println(a);
    System.out.println(b);
}
}