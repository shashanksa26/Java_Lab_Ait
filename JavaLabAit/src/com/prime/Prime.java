package com.prime;
import java.util.*;

public class Prime {
	public static void main(String args[]) {
		int n,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		n=sc.nextInt();
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}if(flag==1)
			System.out.println("the num is not a prime");
		else
			System.out.println("the num is prime");
		sc.close();
	}

}
