import java.util.*;
class Parent														
{
	int a=10;
	int b=20;
}
class Child extends Parent
{
	int y=100;
	int z=200;
	void add(int i, int j)
	{
		System.out.println("i+j");
		System.out.println("x+y");
		System.out.println("a+b");


	public static void main(String[] args) 
	{
		new Child().add(100,200);
	}
}
