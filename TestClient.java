class TestClient 
{
	public static void main(String[] args) 
	{
		EmpBean eb1=new EmpBean();
		// setters are used to set the data
		eb1.setEid(11);
		eb1.setEname("Ayub");

        //getters are used to get the data
		int eid=eb1.getEid();
		System.out.println(eid);
		String ename=eb1.getEname();
		System.out.println(ename);

		EmpBean eb2 =new EmpBean();
		eb2.setEid(12);
		eb2.setEname("Hera");
		System.out.println(eb2.getEid());
		System.out.println(eb2.getEname());
	}

}
