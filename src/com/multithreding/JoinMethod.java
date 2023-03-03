package com.multithreding;

public class JoinMethod extends Thread {

	
/*	public synchronized void start() {
		System.out.println("Inside start method");
	}*/
	synchronized public  void run() {

		try {

			for (int i=0 ; i<=5 ; i++) {

				System.out.println("child thread" +i);
				
				Thread.sleep(500);
		}
	}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException { 	// throws exception for join method

		JoinMethod obj = new JoinMethod();
		JoinMethod obj1= new JoinMethod();
		obj.start();
		obj1.start();
		obj.join();			// main thread wait and execute after complete child thread task.

		try {
			for (int i=0 ; i<=5 ; i++) {

				System.out.println("main thread"+i);

				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}


