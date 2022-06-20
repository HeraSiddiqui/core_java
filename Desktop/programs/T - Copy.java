import java.util.*;
public class T
{
  T(String str){}
	public static void main(String[] args) 
	{
		T t1=new T("Hera");
		T t2=new T("Hera");
        System.out.println(t1.equals(t2));//false

		String s1="Siddiqui";
		String s2="Siddiqui";
		System.out.println(s1.equals(s2));//true

		StringBuffer sb1=new StringBuffer("Khan");
		StringBuffer sb2=new StringBuffer("Khan");
		System.out.println(sb1.equals(sb2));//false
	}
}

/*class Object
{ public boolean equals()
	{
		return "ref-comp";
    }
}

class String extends Object
//overriding equals()
{
	public boolean equals()
	{
		return "content comp";
	}
}

class StringBuffer extends Object
  {//not overriding equals()
  }


/*import java.util.*;
class S 
{
	public static void main(String[] args) 
	{
		String s1="Hera";
		System.out.println(s1);
		System.out.println(s1.toString());

		StringBuffer sb1=new StringBuffer("Siddiqui");
		System.out.println(sb1);
		System.out.println(sb1.toString());
	}
}
*/