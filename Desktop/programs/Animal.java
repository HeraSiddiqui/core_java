import java.util.*;
abstract class  Animal1
{
	abstract void walk();
	public void eat()
	{ System.out.println("Animal eats");
	}
}

class Horse extends Animal1
{
	public void walk()
	{
		System.out.println("Walks on 4 legs");
	}

}

class Chicken extends Animal1
{
	public void walk() {
		System.out.println("Walks on 2 Legs");
	}
}

public class Animal
{
	public static void main(String[] args) 
	{
		Horse h= new Horse();
		h.walk();
		h.eat();

		Chicken c= new Chicken();
		c.walk();
	}
}
