package com.staff;

public class Staff {
	
		String staffId;
		String name;
		long phone;
		double salary;
		public Staff(String staffId, String name, long phone, double salary) {
			super();
			this.staffId = staffId;
			this.name = name;
			this.phone = phone;
			this.salary = salary;
		}
	public void display() {
		System.out.println("staff id is: "+staffId);
		System.out.println("staff name: "+name);
		System.out.println("staff phone: "+phone);
		System.out.println("staff salary: "+salary);
	}
}
