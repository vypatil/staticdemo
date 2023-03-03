package com.control.statements;
import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the day ");

		String day = sc.next();

		switch(day) {
		case "monday": {
			System.out.println("  red colour ");
			break;
		}

		case "tuseday": {
			System.out.println(" pink colour ");
			break;
		}

		case "wednesday" :{
			System.out.println(" yellow colour ");
			break;
		}

		case "thursday" : {
			System.out.println(" orange colour ");
			break;
		}

		case "friday" : {
			System.out.println(" green colour ");
			break;
		}

		case "saturday" : {
			System.out.println(" blue colour ");
			break;
		}




		}

	}

}
