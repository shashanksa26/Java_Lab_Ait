package com.staff;

public class Teaching extends Staff{
	String domain;
	String publications;
	public Teaching(String staffId, String name, long phone, double salary, String domain, String publications) {
		super(staffId, name, phone, salary);
		this.domain = domain;
		this.publications = publications;
	}
public void display() {
	super.display();
	System.out.println("staff Domain: "+domain);
	System.out.println("staff publication: "+publications);
}
}
