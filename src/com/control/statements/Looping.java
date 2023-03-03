package com.control.statements;
import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the age");
		
		int age=sc.nextInt();

		System.out.println("welcome in looping class");

		if (age>=18) {
			
			System.out.println("welcome in portal");
		}else {
			
			System.out.println("your age is not apllicable ");
		}
		
	
		
	}

}
