import java.util.*;
class  Final
{
	public static void main(String[] args) 
	{
	  try
	  {
		System.out.println("Try Block");
	  }
	  catch (ArithmeticException ae)
	  {
		  System.out.println("Catch");
	  }
	  finally
		{
		  System.out.println("Finally Block");
		}
	}
}
