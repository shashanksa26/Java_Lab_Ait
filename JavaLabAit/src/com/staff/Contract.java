package com.staff;

public class Contract extends Staff {
int period;

public Contract(String staffId, String name, long phone, double salary, int period) {
	super(staffId, name, phone, salary);
	this.period = period;
}

	public void display() {
		super.display();
		System.out.println("staff Period: "+period);
		
}
}