import java.util.*;
class Emplo
{
     int eid;
//intializing value to variable. It is executed during object creation
	{
		eid=11;    //if the instance block is left empty value will be by default as zero. 
	}
       void disp()
	{
	  System.out.println(eid);
	}

	public static void main(String[] args) 
	{
		new Emplo().disp();
	}
}
