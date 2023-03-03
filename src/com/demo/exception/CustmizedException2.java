package com.demo.exception;
import java.util.Scanner;
										// custom exception in unchecked exception / Runtime Exception
			
 class NotvoteException extends RuntimeException {
	 
	 NotvoteException (String message){
		 super(message);
	 }
	 
 }
public class CustmizedException2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		if(age<18) {
			
			throw new NotvoteException ("you cant vote");
				
			}else {
				System.out.println("yes you can vote");
			}
		}
		
	}

