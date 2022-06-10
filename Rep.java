import java.util.*;
class Rep
{
	Rep()
	{
		this(10);
     System.out.println("0 Args");
	 //this(10);
	}
	Rep(int a)
	{
        this(10,20);
		System.out.println("1 Args");
		//this(10,20);
	}
	Rep(int a,int b)
	{
		System.out.println("2 Args");
	}
    public static void main(String[] args) 
	{
		Rep r1= new Rep();
		//Rep r2= new Rep();
		//Rep r3 =new Rep();
	}
}
   