package com.static123;

public class Dogs extends MilkFactory {
	static String breed_of_dog="breed";
	String name_of_dog;
	String country_name;
	float rating_of_risk_managment;
	boolean is_honest;
	static { 
		System.out.println("this is child static block");
	}
	{
		System.out.println("this is child instant block");
	}
	
	
	 public Dogs(String name_of_dog, String country_name, float rating_of_risk_managment, boolean is_honest) {
		super("factory");
		this.name_of_dog = name_of_dog;
		this.country_name = country_name;
		this.rating_of_risk_managment = rating_of_risk_managment;
		this.is_honest = is_honest;
	}



	public static void main(String[] args) {
		
		System.out.println("this is main method");
		
      Dogs d1 = new Dogs("husky","siberian",7.5f, true);
      Dogs d2 = new Dogs ("lab","america",4.5f, true);
	  System.out.println("name   "+d1.name_of_dog +"   country   "+d1.country_name + "   risky   "+d1.rating_of_risk_managment + "  strengths   "+d1.is_honest);
	  
	  System.out.println("name    "+d2.name_of_dog +"   country   "+d2.country_name + "   risky   "+d2.rating_of_risk_managment + "  strengths   "+d2.is_honest);
	  
	  
	  
	  
	}

}
