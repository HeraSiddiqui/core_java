import java.util.*;
public class X
{
  void m1() {System.out.println("M1 Method");}
  void m2() {System.out.println("M2 Method");}
} 
class Y extends X
{
  void m3() {System.out.println("M3 Method");}
  void m4() {System.out.println("M4 Method");}
} 
class Z extends Y
{
   void m5() {System.out.println("M5 Method");}
   void m6() {System.out.println("M6 Method");}
  
  public static void main(String[] args) 
	{
		X x=new X();
		x.m1(); x.m2();

		Y y=new Y();
		y.m1(); y.m2(); y.m3(); y.m4();

		Z z=new Z();
		z.m1(); z.m2(); z.m3(); z.m4(); z.m5(); z.m6(); 
	}
}
