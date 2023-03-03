package com.control.statements;
import java.util.Scanner;


 public class IfelseLadder {

	public static void main(String[] args) {
		Scanner mj = new Scanner (System.in);

		System.out.println(" Enter your age ");

		int age = mj.nextInt();

		if (age<=18) {

			System.out.println(" You are underage ");
		}
		else if (age>18 && age<=30) {

			System.out.println(" you are in mid age ");
		}
		else if (age>30 && age<=50) {

			System.out.println(" your age is not able for Form A ");
		}
		else {
			System.out.println(" sorry you are not eligible ");
		}

	}

}
