import.java.util.*;
class  Mtry
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=s.nextInt();
		try
		{
		System.out.println(10/num);
		  try
		  {
		   System.out.println("ratan".charAt(20));	
		  }
		  catch (StringIndexOutOfBoundsException e)
		  {
			  System.out.println("ratanit");
		  }
		}
		catch(ArithmeticException ae )
		{
			System.out.println("DurgaSoft");
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Rest of the app...");
	}
}
