package com.demo.exception;

public class Trycatch {

	public static void main(String[] args) {
	
		try {
				int a=20;
				int b=0;
				int c=a/b;
		}
		
		catch(ArithmeticException e) {     			 // exception in stored in e : also e is object
		
		System.out.println(e);
		System.out.println("Hello java ");
		System.out.println("hi everyone these is java class ");
		
		e.printStackTrace();                     // it is jvms default method to check name of exception,description,stack trace.
		
	//	System.out.println(e.toString());		// to check only name of exception and description.
		
	//	System.out.println(e.getMessage());		// to check only description of exception.
		
		
		
		}
		

	}

}
