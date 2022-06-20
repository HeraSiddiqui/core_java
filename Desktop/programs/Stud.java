import java.util.*;
class  Student
{
	String name;
	int age;

	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}

	//Student()  //constructor
	//{
	//	System.out.println("Constructor Called");
	//}

	Student(String name, int age)  //constructor
	{
		this.name= name;
		this.age= age;
	}
}


 public class Stud
 {

	public static void main(String[] args) 
	{

		Student s=new Student("Aman" , 23);
		//Student s=new Student();
		//s.name="Aman";
		//s.age=22;

		//Student s1 = new Student();
		//s1.name="Shraddha";
		//s1.age=21;

		s.printInfo();
		//s1.printInfo();
	}
}
