package com.demo.CollectionFramework;

import java.util.*;


public class hashset {

	public static void main(String[] args) {
		
		HashSet obj = new HashSet();	//	1st object of Hashtset
		HashSet mk = new HashSet();		// 2nd object of Hashset
		
		obj.add("v");			// adding the elements
		obj.add("z");
		obj.add("vaibhav");
		obj.add("m");
		obj.add(null);
		obj.add(100);
		
		mk.add("500");		// adding the elements in second object
		mk.add("200");
		mk.add("300");
		
		System.out.println(obj);
		
		
		obj.clone();			// create  shallow copy 
		
		
		obj.clear();				// removing all elements
		System.out.println(obj);
		
		mk.contains(obj);
		System.out.println(obj);	// check the same element and return true
		
		
		
	
		
	}

}
