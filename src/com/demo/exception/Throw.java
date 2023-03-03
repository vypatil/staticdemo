package com.demo.exception;

import java.io.IOError;
import java.io.IOException;
								// Throwing unchecked exception
public class Throw {

	public static void validate(int age) {

		if (age<18) {

			throw new ArithmeticException("person is not eligible for vote");		// create a exception object manually.
		}
		else {
			System.out.println("person is eligible for vote");
		}
	}

	public static void main(String[] args) {

		validate(13);

		System.out.println(" stop of the code");
	}


}
