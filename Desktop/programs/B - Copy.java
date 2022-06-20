import java.util.*;
class Address
{
String name;
int hno;
String StreetName;

public void printInfo(String name) {
		System.out.println(name);
	}
public void printInfo(int hno) {
		System.out.println(hno);
	}

public void printInfo(String StreetName) {
		System.out.println(StreetName);
	}

public void printInfo(String name, int age, String sal) {
		System.out.println(name+ " " + hno+ " " +StreetName);
	}

}
class C extends Address
{
String City;
String State;
String Country;
}
public class B
{
	public static void main(String args[])
	{
	    Address a=new Address();
		a.name="Hera";
		a.hno=10;
		a.StreetName=FlowerComplex;

	  a.printInfo(a.name, a.hno, a.StreetName);


        C c=new C();
		c.City="Mumbai";
		c.State= "Maharashtra";
		c.Country="India";

  }
}
