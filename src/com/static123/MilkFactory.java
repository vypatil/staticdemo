package com.static123;

public class MilkFactory extends Milkfactorypro {
	static String name_of_factory="factory";
	int outlets;
	int toatl_products;
	String main_prodcut;
	
	
	
	public MilkFactory(String main_prodcut) {
		super();
		this.main_prodcut = main_prodcut;
	}


	static {
		System.out.println("this is parent static block");
	}
	{
		System.out.println("this is parent instant block");
	}
	

	public static void main(String[] args) {
		
       MilkFactory m1 = new MilkFactory("lassi"); 
       
	}

}
class Milkfactorypro{
	static {
		
		
		System.out.println("this is grand parent static block");
	}
	
	
	
}
