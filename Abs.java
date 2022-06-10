import java.util.*; 
abstract class  Abs
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
 
abstract class Test extends Abs
     {
	  void m1() {System.out.println("m1 Method");}
	 }
     
	 abstract class Test1 extends Test
	 {
	  void m2() {System.out.println("m2 Method");}
	  }

	   class Test2 extends Test1
     {
	  void m3() {System.out.println("m3 Method");}
	  public static void main(String[] args)
	{
		//Abs a=new Abs(); //abstract class cannot create an object
		Test2 t= new Test2();
		t.m1();
		t.m2();
		t.m3();
		
	}
}



/*import java.util.*; 
abstract class  Abs
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
    void m4() {System.out.println("m4 Method");}
}

class Test extends Abs
{
	  void m1() {System.out.println("m1 Method");}
      void m2() {System.out.println("m2 Method");}
      void m3() {System.out.println("m3 Method");}
	public static void main(String[] args) 
	{
		//Abs a=new Abs(); //abstract class cannot create an object
		Test t= new Test();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
} */
