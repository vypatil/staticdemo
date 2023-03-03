package com.static123;

public class Childclass1 extends Parentclass {
	static String child_name="child";
	String name_of_child;
	int age;
	
	static {
		
		System.out.println("this child static block");
	}
	
	{
		System.out.println("this is child instant block");
	}
	
	
	

	public Childclass1(String name_of_child, int age) {
		super();
		this.name_of_child = name_of_child;
		this.age = age;
	}

	public static void main(String[] args) {
		
		System.out.println("this is main method ");
		
		Childclass1 c1 = new Childclass1("tushar",15);
		
	    Childclass1 c2 = new Childclass1("omkar",20);
	    
	    Childclass1 c3 = new Childclass1 ("ajay",25);
	    		
	  
	    System.out.println(c1.name_of_child+ c1.age);
	    
	    System.out.println(c2.name_of_child+c2.age);
		
	    System.out.println(c3.name_of_child+c3.age);
		
	}
	
	
   

	}
    
    
    
   

	

