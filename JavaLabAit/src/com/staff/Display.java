package com.staff;

public class Display {
	public static void main(String args[]) {
		Teaching teaching=new Teaching("1233","ravi",80003444,30000,"cs","atria");
		teaching.display();
		Technical technical=new Technical("5123","harry",80044366,70000,"coding");
		technical.display();
		Contract contract=new Contract("4123","rohan",743231,90000,5);
		contract.display();
		
	}

}
