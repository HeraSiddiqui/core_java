import java.util.*;
class Tod 
{
	int a=100;  //instance var
	int m1(int a) //local var
	{
		System.out.println("M1 Method");
		return a;   //return local var
	}

	public static void main(String[] args) 
	{
		Tod t= new Tod();
         int x=t.m1(10);
		 System.out.println(" Method return value=" +x);
	}
}
