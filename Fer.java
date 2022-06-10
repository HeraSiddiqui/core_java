import java.util.*;
class Fer 
{
   int a=100;
   int m1(int a)
	{
     System.out.println("M1 Method");
	 return this.a;       //giving priority to instance variable to print its value by using this keyword              
	}
	
	public static void main(String[] args) 
	{
      Fer f=new Fer();
	  int x=f.m1(10);
      System.out.println("Method return value="+x);
	}
}
