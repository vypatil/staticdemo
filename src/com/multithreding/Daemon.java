package com.multithreding;

public class Daemon extends Thread {

	public void run() {

		if (Thread.currentThread().isDaemon()) {

			System.out.println(" is daemon thread ");
		}
		else {
			System.out.println(" user thread");
		}

	}

		public static void main(String[] args) {

			Daemon d1 = new Daemon();
			Daemon d2 = new Daemon();
			Daemon d3 = new Daemon();
			
			
			d1.setDaemon(true);			// set daemon to the thread 
			
			d1.start();					// daemon thread
			d2.start();					// user thread 
			d3.start();					// user thread
			
	}	
}
