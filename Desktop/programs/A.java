import java.util.*;
abstract class  Animal1
{
	abstract void walk();
}

class Horse extends Animal
{
	public void walk()
	{
		System.out.println("Walks on 4 legs");
	}

}

class Chicken extends Animal
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
	}
}
