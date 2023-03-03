package com.demo.CollectionFramework;

import java.util.*;


public class iteratorMethod {

	public static void main(String[] args) {
	
		List l = new ArrayList();
		
		l.add(34);
		l.add("vaibhav");
		l.add("sush");
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}

}
