import java.util.*;
class  Poly
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


	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
