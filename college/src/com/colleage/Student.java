package com.colleage;

public class Student {
	private String name;
	private String rollno;
	private String dept;
	
	private Adress add;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public void display()
	{
		System.out.println(" name " + name);
		System.out.println(" name " + rollno);
		System.out.println(" name " + dept);
		
		
	}

}
