
package com.demo.exception;
import java.util.Scanner;
								// customized Exception in checked exception / compile time exception

							//Exception parent
class UnderageException extends Exception{

	UnderageException(String message){	// parameterised constructor
		super(message);
	}
}
public class CustomizedException {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);			// scanner for taking input form user
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		try {
			if (age<18) {
				
				throw new UnderageException("cant vote your age is below 18 ");		// pass parameter for constructor 2
			}
			else {
				System.out.println("You can vote now");
			}
		}catch(UnderageException e) {
			
			e.printStackTrace();
		}
	}

}
