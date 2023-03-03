package com.demo.exception;

public class Finally {
	
	public static void main(String[] args) {
		
		try {
			int a=10 , b=0;
			int c=a/b;
			
		}
		catch(ArithmeticException e ) {
			
			System.out.println(e);
			
			System.exit(0);						// finally block no executed after sysytem.exit 
			
		}
		finally {
			System.out.println("this is fianl block always executed exception handled or not ");
		}
		
	}

}
