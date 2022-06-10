import java.util.*;
class  Inst
{
    Inst()
	{
	 System.out.println("0 Args Constructor");
	}
    Inst(int a)
	{
	  System.out.println("1 Args Constructor");
	}
    Inst(int a,int b)
	{
	  System.out.println("2 Args Constructor");
	}
	{
	  System.out.println("Instance Block");
	}

	public static void main(String[] args) 
	{
	    new Inst();
		new Inst(10);
		new Inst(10,20);
		
	}
}

/*C:\Users\admin\Desktop\javaprograms>java Inst

Output:-
Instance Block
0 Args Constructor
Instance Block
1 Args Constructor
Instance Block
2 Args Constructor */