import java.util.*;
class Except
{                  
  public static void main(String[] args)
    { try
      { System.out.println(10/0);
	    System.out.println("ratan");  //ratan anu 5rest of the app...(output of the code)
        System.out.println("anu");   
      }
      catch (ArithmeticException ae)
      { System.out.println(10/2);
      }
   System.out.println("rest of the app...");
  }
}

/*import java.util.*;
class Except
{                  
  public static void main(String[] args)
    { try
      { System.out.println("ratan");  //ratan anu 5rest of the app...(output of the code)
        System.out.println("anu");    
		System.out.println(10/0);
      }
      catch (ArithmeticException ae)
      { System.out.println(10/2);
      }
   System.out.println("rest of the app...");
  }
}


/*import java.util.*;
class Except
{                  
  public static void main(String[] args)
    { try
      { System.out.println(10/0);  //5 rest of the app... (output)  Exception raised other than try: it is abnormal termination
      }
      catch (ArithmeticException ae)
      { System.out.println(10/2);
      }
   System.out.println("rest of the app...");
  }
}

/*import java.util.*;
class Except
{                  
  public static void main(String[] args)
    { try
      { System.out.println("Hera");
      }
	  //System.out.println("Coding"); //This is not valid. In between the try catch block no declarations are valid.
      catch (NullPointerException ae)
      { System.out.println(10/2);
      }
   System.out.println("rest of the app...");
  }
}

/*import java.util.*;
class Except             //error: 'try' without 'catch', 'finally' or resource declarations, try alone not allowed.
{
	public static void main(String[] args)
	{
		try
		{
		 System.out.println("Hera");
		}
		System.out.println("Rest of the app");
	}
}

/*import java.util.*;
class Except
{                  //No exception in try: catch blocks not checked
  public static void main(String[] args)
    { try
      { System.out.println("Hera");
      }
      catch (NullPointerException ae)
      { System.out.println(10/2);
      }
   System.out.println("rest of the app...");
  }
}


/*import java.util.*;
class Except
{
	public void m1()
	{
	}
}
class T extends Except
{
	public void m1() throws Exception
	{
	}
}


/*import java.util.*;
class Except
{
	public void m1() throws IOException
		{
	}
}
class T extends Except
{
	public void m1() throws EOFException, InterruptedException
	{
	}
}


/*import java.util.*;
class Except
{
	public void m1()
	{
	}
}
class T extends Except
{
	public void m1() throws Exception
	{// Main method not found in class Except, It shows an error at the compile it.  It doesn't match with the parent class.
	}
}



/*import java.util.*;
class Except
{
	public void m1() throws Exception
	{    // Main method not found in class Except,
	}   //here it will compile without Any Problem But Give An Exception at the runtime.
}
class T extends Except
{
	public void m1()
	{
	}
}

/*import java.util.*;
class Except 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		try
		{
			System.out.println(10/0);
		}
		catch (NullPointerException ae)
		{
			System.out.println(10/2);
		}
		System.out.println("Rest of The App");
	}
}


/*import java.util.*;
class Except 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try
		{
			System.out.println(10/0);
		}
		catch (ArthimeticException ae)
		{
			System.out.println(10/2);
		}
		System.out.println("Rest of The App");
	}
}*/
