import java.util.*;
import java.lang.*;
class X{}
class Emp{}
class Y{}
class Student{}
class Exam1 
{
	void m1(X x, Emp e)
	{
    	System.out.println("m1 method");
	}
	static void m2(Y y, Student s)
	{
		System.out.println("m2 Method");
	}
	public static void main(String[] args) 
	{
      Exam1 e=new Exam1();
	  X x=new X();
      Emp e1=new Emp();
	  e.m1(x,e1);
      
	  Exam1.m2(new Y(), new Student());
	 
	}
}
 

 //Method1                                 //Method2

 //Y y=new Y();                           
	 // Student s=new Student();           //Exam1.m2(new Y(), new Student());
	  //Exam1.m2(y,s);