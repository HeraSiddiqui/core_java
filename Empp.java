import java.util.*;
class Empp
{
	int eid;
	String ename;
	float esal;

Empp(int eid,String ename,float esal)
	{
      this.eid=eid;
	  this.ename=ename;
	  this.esal=esal;
	}
void disp()
{
System.out.println("emp id="+eid);
System.out.println("emp name="+ename);
System.out.println("emp sal="+esal);
}
	public static void main(String[] args) 
	{
		Empp e=new Empp(1,"Hera", 20000);
		e.disp();
		Empp e1=new Empp(2, "Aabish", 10000);
		e1.disp();
		 
	}
}