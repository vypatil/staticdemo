package com.static123;

public class MethodChain {

	public static void main(String[] args) {
		
		System.out.println("this is main method");
		
		MethodChain m1 =new MethodChain();
		
		m1.k1();
		
	}
	
	void k1() {
		
		
		
		int x = 50;
	
		int g = k2(x);
		System.out.println(g);
	}
	 
	int k2(int k) {
		int y = 70;
		int abc = y*k;
		//System.out.println(abc);
		return abc;
		
		
		
	}
	
	

}
