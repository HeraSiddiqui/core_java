import java.util.*;
class  Emp
{
	String name;
	int age;
	float sal;

	public void printInfo(String name) {
		System.out.println(name);
	}

	public void printInfo(int age) {
		System.out.println(age);
	}

	public void printInfo(float sal) {
		System.out.println(sal);
	}
	
   public void printInfo(String name, int age, float sal) {
		System.out.println(name+ " " + age+ " " +sal);
	}
}

public class Poly
{
	public static void main(String[] args) 
	{
	 Emp e= new Emp();
	 e.name= "Hera";
	 e.age=22;
	 e.sal=25000f;

   e.printInfo(e.name, e.age, e.sal);
    
	}
}