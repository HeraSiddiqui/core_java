import java.util.*;
class Load    // Operator Overloading
{
	public static void main(String[] args) 
	{
		System.out.println(10+20);
		System.out.println("Hera" + "Siddiqui");

        
		System.out.println(10+"Siddiqui");
		System.out.println(10+"Hera" + "Siddiqui" +10+20);
	}
}

/*import java.util.*;
class Load    // Constructor Overloading
{
	Load(int a)
	{
		System.out.println("Method 1");
	}
	Load(int a,int b)
	{
		System.out.println("Method 2");
	}
	Load(char ch)
	{
		System.out.println("Method 3");
	}

	public static void main(String[] args) 
	{
		new Load(10);
		new Load(10,20);
        new Load('a');
		}
}

//Method OverLoading
/*import java.util.*;
class Load
{
	void m1(int a)
	{
		System.out.println("Method 1");
	}
	void m1(int a,int b)
	{
		System.out.println("Method 2");
	}
	void m1(int a,int b, int c)
	{
		System.out.println("Method 3");
	}

	public static void main(String[] args) 
	{
		Load l=new Load();
		l.m1(10);
		l.m1(20,30);
		l.m1(30,40,50);
	}
} */
