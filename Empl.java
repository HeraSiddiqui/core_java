import java.util.*;
class Empl
{
	int eid;
	String ename;
	float esal;


Empl()
	{
	eid=111;
	ename="Hera";
	esal=10000.56f;
	}

void disp()
{
System.out.println("emp id="+eid);
System.out.println("emp name="+ename);
System.out.println("emp sal="+esal);
}
	public static void main(String[] args) 
	{
		Empl e=new Empl();
		e.disp();
		Empl e1=new Empl();
		e1.disp();
		 
	}
}


