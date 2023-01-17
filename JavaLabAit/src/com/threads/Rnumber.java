package com.threads;
import java.util.Random;
public class Rnumber extends Thread{
	public void run() {
		Random random=new Random();
		for(int i=0;i<5;i++) {
			int randomInteger =random.nextInt(10);
			System.out.println("Random integer generated: "+randomInteger);
			Square s=new Square(randomInteger);
			s.start();
			Cube c=new Cube(randomInteger);
			c.start();
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}

}
