package com.static123;

public class Methodchain3 {

	public static void main(String[] args) {
		
  Methodchain3 mtd = new Methodchain3();
		mtd.v1();
	  }      
	    
	
	  void v1 () {
		  int f = 20;
		  System.out.println(f);
				  
		  v2(f);
		  String r=v2(f);
		  System.out.println(r);
	  }
	  
	  String v2 (int f) {
		  
		  int a = f*50;
		  System.out.println(a);
		  String p1 = "java";
		  return p1;
		  
	  }
}

