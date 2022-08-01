package com.lkm.chauhan;

public class ParameterizedConstructor {
	
	int sid;
	String sname;
 ParameterizedConstructor(int id, String name)
 {
	 this.sid=id;
	 this.sname=name;
	
 }
	public void ma()
	{
		System.out.println("StudentID:"+sid);
		System.out.println("StudentName:"+sname);
	}

	public static void main(String[] args) 
	{	
		
		ParameterizedConstructor p = new ParameterizedConstructor(12121,"CHAUHAN");
		
		p.ma();
		
		

	}

}
