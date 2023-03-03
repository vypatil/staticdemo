package com.multithreding;

public class SleepMethod implements Runnable{

	public void run () {

		for (int i=1 ; i<=5 ; i++) {

			try {

				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args)  {

		SleepMethod s1 = new SleepMethod();

		Thread t1 = new Thread(s1);

		t1.start();




	}

}
