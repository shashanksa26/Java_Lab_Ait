package com.threads;

public class Cube extends Thread {
	int x;
	Cube(int n){
		x=n;
	}
	public void run() {
		int cub=x*x*x;
		System.out.println("cube of "+x+"="+cub);
	}

}
