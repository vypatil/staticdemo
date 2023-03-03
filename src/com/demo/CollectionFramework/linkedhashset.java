package com.demo.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
	
	public static void main(String[] args) {
			
			LinkedHashSet obj = new LinkedHashSet<>();
			
			obj.add("java");
			obj.add("prowings");
			obj.add(100);
			obj.add(500);		// duplicates are not allowed.
			obj.add(500);
			obj.add(null);
			obj.add(null);		// only one null is allow.
			
			
			System.out.println(obj);
			
			Iterator itr = obj.iterator();	//	for iteration elements
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println(obj.size());		// to check size of object
			
			obj.toArray();				// converting into array.
		
			obj.remove(500);			// for remove particular object
			System.out.println(obj);
			
			
			
			
		}

}
