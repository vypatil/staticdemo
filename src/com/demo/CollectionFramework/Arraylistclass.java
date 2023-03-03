package com.demo.CollectionFramework;

import java.util.*;
public class Arraylistclass {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList<>(4);

		obj.add(10);				// adding objects
		obj.add(20);
		obj.add(2);
		obj.add(45);

		ArrayList obj2 = new ArrayList<>();

		obj2.add(4.50);
		obj2.add("String");
		obj2.add('c');
			obj.add(null);
		obj.add(500);
	obj2.add(null);
		obj2.add(500);

		obj2.removeAll(obj);			// remove all objects in present in obj2 as same as obj

		System.out.println(obj2);
		System.out.println(obj);

		obj.remove(3);					// remove object 

		System.out.println(obj2);

		obj.addAll(obj2);				// append obj to obj2

		System.out.println(obj);

		System.out.println(obj2.contains("niku"));		// this element not present in this arraylist so show false
		
		obj.set(3, 447);			// set new value and remove old on index based		
		System.out.println(obj);
		
		System.out.println(obj.retainAll(obj2));
		
		Iterator itr = obj.iterator();		// using iterator element print one by one
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}




	}

}
