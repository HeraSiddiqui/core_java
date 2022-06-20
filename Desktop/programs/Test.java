import java.util.*;
class Test 
{
	public void m1(int i)
	{
		System.out.println("int-args method");
	}
	public void m1(float f)
	{
		System.out.println("float-args method");
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m1(10);
		t.m1(11.5f);
		t.m1('a');
		t.m1(10l);
	}
}
