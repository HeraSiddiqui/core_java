import java.util.*;
class Text1 
{
	public void m1()
	{
		System.out.println("No Args");
	}
	public void m1(int i)
	{
		System.out.println("Int-Args");
	}
	public void m1(double d)
	{
		System.out.println("Double- Args");
	}




	public static void main(String[] args) 
	{
		Text1 t=new Text1();
		t.m1();
		t.m1(12);
		t.m1(10.5);
	}
}
