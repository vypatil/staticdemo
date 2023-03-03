package com.demo.CollectionFramework;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {
	
	public static void main(String[] args) {
		
		SortedSet<Integer> obj = new TreeSet<Integer>();
		SortedSet<String> obj2 = new TreeSet<String>();
		
		obj.add(100);
		obj.add(1);
		obj.add(10);
		obj.add(16);
		obj.add(17);
		
		System.out.println(obj);
		
		obj2.add("India");
		obj2.add("USA");
		obj2.add("PUK");
		
		System.out.println(obj2);
		
		System.out.println(obj.first());	// first element of the set 
		
		System.out.println(obj.last());		// last element of the set
		
		System.out.println(obj.subSet(10,17));	// give element between this to elements
		
		System.out.println(obj.headSet(100));	// give the elements lower than this elements
		
		System.out.println(obj.tailSet(10));	// give the elements higher than and equal to this element
		
		System.out.println(obj.comparator());	// used for sorting order in set and give null if natural sorting
		
		
	}

}
		
	
