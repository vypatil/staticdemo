package com.static123;

public class Parentclass extends Grandparent {
	
	int k = 100;
	
	
	static {
		
		System.out.println("this is parent static block");
	}
	{
		System.out.println("this is parent instant block");
	}

	public static void main(String[] args) {
		

	}

}
    class Grandparent{
    	
    	int j=500;
    	
    	
    	static {
    		
    		System.out.println("this is garndparent static block ");
    		
    	}
    	 
    	{
    		System.out.println("this is grandparent instant block");
    		
    	}
    	        
    	        
    	       
    			
    	
    	
    	
    }


