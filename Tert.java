import java.util.*;
class Tert                                                    //here an instance block will be executed first rather than the construtor.
{
Tert()
	{
	  System.out.println("0 arg cons");
	}
	{
    System.out.println("Instance Block");
	}

	public static void main(String[] args) 
	{
		//Tert t=new Tert();  //named object
		new Tert(); //Nameless Object both can be used 

	}
}
