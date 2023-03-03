package com.multithreding;

import java.util.Arrays;

class A extends Thread {		// using thread class 

	public void run() {

		for (int i=0 ; i<5 ; i++) {
			System.out.println("thread A ");
		}
	}
}

class B implements Runnable {		// using implements runnable interface (functional).

	public void run() {

		for (int i=0 ; i<5 ;i++) {
			System.out.println("thread B ");
		}
	}
}	

public class Mango {

	public static void main(String[] args) {
		System.out.println("main method start");

		A obj1 = new A();	// create thread class of A
		B obj2 = new B();	// create thread class of B

		Thread t1 = new Thread(obj2);			// creating a thread class object

		obj1.start();
		t1.start();						// calling thread class start method.

		obj1.setName("Mumbai");		// set name for thread
		t1.setName("Kolhapur");		// set name for thread

		System.out.println(obj1.getName());			// to check thread name
		System.out.println(t1.getName());			// to check thread name

		System.out.println("first thread default priority ---> " + obj1.getPriority());

		t1.setPriority(8);
		System.out.println("second thread priority is ---> " + t1.getPriority());

		System.out.println(Thread.currentThread().getName());	
		Thread.currentThread().setName("vaibhav");				// to change main thread name
		System.out.println(Thread.currentThread().getName());	// to check main thread name.


	}

}
