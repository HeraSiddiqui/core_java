import java.util.*;
class Red 
{
	int m1()
	{
	System.out.println("M1 Method");
	return 10;
	}

	float m2()
	{
     System.out.println("M2 Method");
	 return 10.5f;
	}

    static  char m3()
	{
	  System.out.println("M3 Method");
	  return 'a';
	}

	public static void main(String[] args) 
	{
		Red r=new Red();
	    int x=r.m1();
		System.out.println("return value of m1()" +x);

		float f=r.m2();
        System.out.println("return value of m2()" +f);

        char ch= Red.m3();
	    System.out.println("return value of m3()=" +ch);

	}

}
