import java.util.*;
class Multicatch
{
	public static void main(String[] args) 
	{
		try      //Here  if the catch block doesn't catch the SIOBE it will not execute rest of the code.
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter a number");
			int num= s.nextInt();
			System.out.println(10/num);   //AE
			System.out.println("Hera".charAt(12));  //SIOBE
		}
		catch (Exception e)
		{
			System.out.println("herait.com..." +e);
		}
		System.out.println("Rest of the app...");
	}
}


/*import java.util.*;
class Multicatch
{
	public static void main(String[] args) 
	{
		try      //Here  if the catch block doesn't catch the SIOBE it will not execute rest of the code.
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter a number");
			int num= s.nextInt();
			System.out.println(10/num);   //AE
			System.out.println("Hera".charAt(12));  //SIOBE
		}
		catch (ArithmeticException ae)
		{
			System.out.println("herait.com");
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("DurgaSoft");
		}
		System.out.println("Rest of the app...");
	}
}
/* Enter a number
0
herait.com
Rest of the app...

C:\Users\admin\Desktop\programs>javac Multicatch.java

C:\Users\admin\Desktop\programs>java Multicatch
Enter a number
2
5
DurgaSoft
Rest of the app...  */
