import java.util.*;
class Stat 
{
	{
	System.out.println("Instance block - 1");
	}
	{
	System.out.println("Instance block - 2");
	}
	
	static
	{                                                                      

	System.out.println("Static Block - 1");
	}

   static
	{
	System.out.println("Static Block -2");
	}

   Stat()
	{
		System.out.println("0 Args Constructor");
	}
   Stat(int a)
	{
		System.out.println("1 Args Constructor");
	}


	public static void main(String[] args) 
	{
		new Stat();
		new Stat(10);
	}
}


/* C:\Users\admin\Desktop\javaprograms>java Stat
Static Block - 1
Static Block -2
Instance block - 1
Instance block - 2
 Args Constructor
Instance block - 1
Instance block - 2
1 Args Constructor */