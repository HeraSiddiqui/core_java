import java.util.*;  //Multiple Inheritance that is done by an Interface as java does not support Multiple Inheritance so it is done with
//the help of an Interface
class L 
{
	interface Bird
	{
		int eyes=2;
		public void fly();
	}

}

	interface  Carnivores
	{

	}

	class Crow implements Bird, Carnivores
	{
		public void walk() {
			System.out.println("Walks on Four Legs");
		}
	}

public class Bird
{
	public static void main(String[] args) 
	{
		Crow c=new Crow();
	    c.walk();

	}
}
