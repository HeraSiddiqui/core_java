import java.util.*;
class  U
{
	String name;
	int age;
	float sal;
   public void printInfo(String name)
	{
	System.out.println(name);
	}
   public void printInfo(int age)
	{
	System.out.println(age);
	}
     public void printInfo(float sal)
	{
	System.out.println(sal);
	}
	 public void printInfo(String name, int age, float sal)
	{
	System.out.println(name+" "+ age+ " "+sal);
	}
}

public class Pol
{
	public static void main(String[] args) 
	{
		U u=new U();
		u.name="Hera";
		u.age=10;
		u.sal=29000f;

		p.printInfo(p.name, p.age, p.age);
	}
}
