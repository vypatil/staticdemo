package com.demo.exception;

import java.util.Scanner;

class notallowexception extends Exception {
		
		notallowexception(String message){
			super(message);
		}
		
	}

public class self {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age ");
		int age=sc.nextInt();
		
		
		try {
		if(age<18) {
			
			throw new notallowexception ("not permission");
				
		}
		
		else {
			
			System.out.println("permission grant");
		}
		}catch(notallowexception e) {
			e.printStackTrace();
		}
	}

}
