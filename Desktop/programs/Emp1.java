import java.util.*;
class  Emp1
{
	int eid;
	String ename;

	Emp1(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}

	public String toString()
	{
		return "emp id="+eid+" emp name=" +ename;
			}
	public static void main(String[] args) 
	{
		Emp1 e=new Emp1(12,"HERA");
		System.out.println(e);
		System.out.println(e.toString());
	}
}
