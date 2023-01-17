package com.resume;

public class Student implements Resume{
	String name,discipline;
	float result;
	public void biodata()
	{
		name="Rahul Sharma";
		result=9.8f;
		discipline="Computer Science and Engineering";
		System.out.println("");
		System.out.println("Student Resume");
		System.out.println("Name : " +name);
		System.out.println("Result : "+result+" cgpa");
		System.out.println("Discipline : "+discipline);
	}
	

}
