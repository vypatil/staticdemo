package com.multithreding;

public class Test implements Runnable {

	public void run() {
		
		System.out.println("inside the run method");
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		Thread th = new Thread(t1);
		
		th.start();
		
		
	}
	
}
