package com.demo.CollectionFramework;

import java.util.*;

public class Stackclass {

	public static void main(String[] args) {
		
		Stack obj = new Stack();
		
		obj.push("deepak");
		obj.push("vaibhav");
		obj.push(300);
		obj.push(100);
		
		System.out.println(obj);
		
	//	System.out.println(obj.peek());		// show adding last element on stack i.e first element (LIFO).
		
		System.out.println(obj.pop());		// show and remove last adding element i.e first element
		
		System.out.println(obj);
		
		System.out.println(obj.search(100));	// check available object is present or not and returns 1 & -1.
		
		System.out.println(obj.empty());   		//to check is empty or element available and returns ture of false.
		
		obj.push("sush");
		System.out.println(obj);			// add element on top of stack.
			
	}

}
