package com.multithreding;

public class Apple implements Runnable {


	public static void main(String[] args) {		// default thread 

		System.out.println("***********Multithreding demo************");

		Apple a1 = new Apple();		// new thread created

		Thread t1 = new Thread(a1);

		for (int i=0 ; i<5 ; i++) {
			System.out.println("Hello....");

		}

		t1.start(); // resister this newly created thread with a post of OS called as "thread-Schedular".

	}

	public  void run() {

		for (int i=0 ; i<5 ; i++) {
			System.out.println("Hi....");
		}
	}
}

