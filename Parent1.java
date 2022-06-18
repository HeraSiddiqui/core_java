import java.util.*;
public class Parent1
{
	{
	System.out.println("Parent Class Ins Block");
	}
    Parent1()
	{
	System.out.println("Parent Class 0 Args cons");
    }
}

class Child extends Parent1
{
	{
	System.out.println("Child Class Ins Block");
    }
    Child() 
	{
	System.out.println("Child Class 0 Args Cons");
     }
		public static void main(String[] args) 
	{
		new Child();
	}
}










/*import java.util.*
class Parent1
{
	{
	System.out.println("Parent Class Ins Block");
}
}
class Child extends Parent1
{
	{
	System.out.println("Child Class Ins Block");
}
	

	public static void main(String[] args) 
	{
		new Child();
	}
}*/
