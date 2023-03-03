package com.demo.CollectionFramework;

import java.util.*;

public class ArraylistIterator {

	public static void main(String[] args) {

		List l1 = new ArrayList();

		l1.add("first");
		l1.add(100);
		l1.add("shree");
		l1.add("Ram");
		l1.add("Last");
		
		ListIterator li = l1.listIterator();
		
		while(li.hasNext()) {				// iteration has more elements
			
			System.out.println(li.next());	// next element
			
			
		}
			System.out.println("----------------------");
			
		while(li.hasPrevious()) {				// retrive reverse direction
			
			System.out.println(li.previous());
		}
		
		l1.remove("Last");
		
		System.out.println(l1);					// remove the element
							
	}

}
