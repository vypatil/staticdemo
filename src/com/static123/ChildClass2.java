package com.static123;

public class ChildClass2 {
	
	static {
		System.out.println("this is child block");
	}
	{
		
		System.out.println("this is instant block");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("this is main method");
	}

	 ChildClass2 c1 = new ChildClass2();
     

}
		
