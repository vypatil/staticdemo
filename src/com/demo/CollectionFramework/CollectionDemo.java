package com.demo.CollectionFramework;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add("vaibhav");
		al.add("java");
		
	//	System.out.println(al.add(null));		
	//	System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		
		al2.add(900);
		al2.add(800);
		al2.add(null);
	//	System.out.println(al2);
		
		al.addAll(al2);			
	//	System.out.println(al);
		
		al2.remove(1);
	//	System.out.println(al2);
		
		al2.retainAll(al);
	//	System.out.println(al2.size());
		
	//	System.out.println(al.containsAll(al2));	
		
		al.toArray();
		System.out.println(al);
		
		
	}

}
