import java. lang. StringBuffer;
import java.util.*;
class Test3
{
	public static void main(String[] args) 
	{  
		//Conversion of String to StringBuffer
		String str="Hera";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
        
		//Conversion of StringBuffer to String
        StringBuffer sb1=new StringBuffer("Hera");
		String ss=new sb1.toString();
		System.out.println(ss);
	}
}
