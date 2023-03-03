package com.multithreding;

public class YieldMethod extends Thread  {

	public void run()  {
	
		for (int i=1 ; i<=5 ; i++) {
			
			try {
				
				Thread.sleep(500);
			}
			catch(Exception e) {
				
				System.out.println(e);
			}
			
			System.out.println(Thread.currentThread().getName()+ "--->" + i);
		}
	}	

	public static void main(String[] args) {

		YieldMethod obj = new YieldMethod();

		obj.start();
		
		Thread.yield();					//stop this thread give the chance to execute other thread for execution. But it depends on thread scheduler.
		
		for (int k=0 ; k<=5 ; k++) {
			System.out.println(Thread.currentThread().getName() +" -->" + k);
		}
	}

}
