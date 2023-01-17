package com.exception; 
import java.util.*;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		sc.close();
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException d) {
			System.out.println(d);
		}

	}

}
