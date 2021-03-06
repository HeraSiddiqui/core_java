// PARENT CLASS CONSTRUCTOR
import java.util.*;
class Parent														
{
	Parent()    //if you do not create a parent constructor it will still exxecuted because of the default constructor
	{
	System.out.println("Parent Class 0 Args");
	}
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Parent Class 0 Args");
	}
	public static void main(String[] args) 
	{
		new Child();
	}
}

// PARENT CLASS CONSTRUCTOR
/*import java.util.*;
class Parent														
{
	Parent()
	{
	System.out.println("Parent Class 0 Args");
	}
}
class Child extends Parent
{
	Child()
	{
		this(10);   //if using super keyword then it maybe the first statement i.e. before this keyword
		System.out.println("Parent Class 0 Args");
	}
Child(int a)
	{
		System.out.println("Parent Class 1 Args");
}
	public static void main(String[] args) 
	{
		new Child();
	}
}


/* VARIABLES METHODS
import java.util.*;
class Parent														
{
	void m1(){System.out.println("M1 Method");}
}
class Child extends Parent
{
	void m1(){System.out.println("M1 Method");}

	void m2()
	{
		this.m1(); //this keyword is not necessary
		m1();
	}


	public static void main(String[] args) 
	{
		new Child().m2();
	}
}

// VARIABLES EXAMPLE
/* import java.util.*;
class Parent														
{
	int a=10;
	int b=20;
}
class Child extends Parent
{
	int y=100;
	int z=200;
	void add(int i, int j)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}


	public static void main(String[] args) 
	{
		new Child().add(100,200);
	}
}
*/