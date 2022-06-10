import java.util.*;
class Per
{
	Per()
	{
     System.out.println("0 Args");
	}
	Per(int a)
	{
		System.out.println("1 Args");
		//this(10,20);
	}
	Per(int a,int b)
	{
		System.out.println("2 Args");
	}
    public static void main(String[] args) 
	{
		//named approach
		Per p1= new Per();
		Per p2= new Per(10);
		Per p3 =new Per(10,20);

		//nameless approach
		 new Per();
		 new Per(10);
		 new Per(10,20);

	}
}
