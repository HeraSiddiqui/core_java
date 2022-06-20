import java.util.*;
class Ani
{  
    void eat()
		{
		System.out.println("eating...");
	    }         
}
class Dog extends Ani
	{  
      void bark()
		  {
		  System.out.println("barking...");
	       }  
}  
 public class TestInheritance
 {  
        public static void main(String args[])
			{  
              Dog d=new Dog();  
              d.bark();  
              d.eat();  
            }
}  