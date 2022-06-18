import java.util.*; //Method Overriding	
  class Ride
  {
	public  void m1() {System.out.println("Parent m1()");}  
  }                                                          
  class P extends Ride
  {
	 void main(String Args[])                          
	{
		P p=new P();
		p.m1();
	}
}





/*import java.util.*; //Method Overriding	
  class Ride
  {
	private  void m1() {System.out.println("Parent m1()");} //when you add private it will not be executed as it cannot be accessed. Child class cannot 
  }                                                         //access it. Private is bounded to its class. 
  class P extends Ride
  {
	public static void main(String Args[])                          
	{
		P p=new P();
		p.m1();
	}
}


/*import java.util.*;
class Ride
{
	void m1()
	{
		System.out.println("Parent m1()");//overriden Method
	}
}
class P extends Ride
{
	void m2()
	{
		System.out.println("Child m1()");//overriding Method
		System.out.println("Child m2()");//direct Method
}
public static void main(String[] args)
	{
	Ride r=new P();
	r.m1();
	//r.m2(); this will not be executed because the method should be availabe in parent class.

	P p=(P)r;
	p.m2();	
	}

}

/*import java.util.*; //Method Overriding	
  class Ride
  {
	 static void m1() {
		System.out.println("Parent Choice");
		}
  }
    class P extends Ride
    {
		static void m1()
		{
         System.out.println("His Choice");
    }
	public static void main(String Args[])                          
	{
		P p=new P();
			p.m1();
	}
} 
 
 /*import java.util.*; //Method Overriding	
  class Ride
  {
	public static void main(String Args[])                          
	{
		int a=30; //we cannot use final on the int place because it would not take as a rule of the method overriding
		a=a+10;
		System.out.println(a);
	}
}
  
  /*import java.util.*; //Method Overriding	
  class Ride
  {
	void m1() {
		System.out.println("Parent Choice");
		}
  }
    class P extends Ride
    {
		int m1() //void changed to int It cannot be executed because return types should be same.
		{
         System.out.println("His Choice");
    }
	public static void main(String Args[])                          
	{
		new P().m1();
	}
}



/*import java.util.*; //Method Overriding	Method signature in parent and child class must be same
  class Ride
  {
	void m1() {
		System.out.println("Parent Choice");
		}
  }
    class P extends Ride
    {
		void m1()
		{
         System.out.println("His Choice");
    }
	public static void main(String Args[])                          
	{
		new P().m1();
	}
}
*/