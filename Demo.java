import java.util.*;
class  Demo
{
	int a=10;
    static int b=20;
	public static void main(String[] args) 
	{
        Demo d=new Demo();
		System.out.println(d.a); //10
		System.out.println(d.b); //20
		d.a=999;
        d.b=888;
		System.out.println(d.a); //999
		System.out.println(d.b); //888

      Demo d1=new Demo();
	  System.out.println(d1.a); //10
	  System.out.println(d1.b); //888 
	  d1.b=777;
	  
	  Demo d2=new Demo();
	  System.out.println(d2.a); //10
	  System.out.println(d2.b); //777

	}
}
