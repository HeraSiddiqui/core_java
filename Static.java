class Static 
{
	static int a=1000;//static var
	static int b=2000;  
	public static void main(String[] args) 
	{//static area
		System.out.println(Static.a);  //accessing by class name
		System.out.println(Static.b);
		Static s= new Static();
		s.m1();
	}
	//instance area
   void m1(){//instance area
	   System.out.println(Static.a); //accessing by class name in instance and static area both.
	   System.out.println(Static.b);
   }
}

 