import java.util.*;
class Student
{
 String name;
 static String school;

 public static void changeSchool(){
	 School="newschool";
 }

}

public class Stu
{
	public static void main(String[] args) 
	{
		Student.school="H.A.E.S";
		Student s1= new Student();
		s1.name="Hera";
		System.out.println(s1.school);
	}

}
	