package com.staff;

public class Technical extends Staff {
String skills;

public Technical(String staffId, String name, long phone, double salary, String skills) {
	super(staffId, name, phone, salary);
	this.skills = skills;
}
public void display() {
	super.display();
	System.out.println("staff Skill: "+skills);
	
}
}