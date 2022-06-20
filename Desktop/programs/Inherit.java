import java.util.*;// Inheritance
class Shape 
{
public void area()
	{
	System.out.println("Displays Area");
  }
}

class Triangle extends Shape
   {

	  public void area(int l, int h)
	   {
		  System.out.println(1/2*l*h);
	   }
   }

class Circle extends Triangle
   {

	  public void area(int r)
	   {
		  System.out.println((3.14)*r*r);
	   }
   }

public class Inherit
{
	public static void main(String[] args) 
	{
		Triangle t1= new Triangle();
		t1.area(9,3);
		
		Circle c= new Circle();
		c.area(2);
	}	

}


