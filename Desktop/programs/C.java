import java.util.*;
class P
{//overriding
	public void property()
	{
		System.out.println("Cash + Gold");
	}
 
    public void marry()
	{
		System.out.println("HERA");
	}

}
	class C extends P
	{
		public void marry()
		{
			System.out.println("Katrina");
		}
	public static void main(String[] args) 
	{
	//	P p=new P();
	//	p.marry();

	//	C c=new C();
	//	c.marry();

     //	P p=new C();  //output Katrina
	   // p.marry();

      C c= new P();
      c.marry();


	}
}
