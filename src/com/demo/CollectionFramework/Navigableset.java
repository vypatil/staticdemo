package com.demo.CollectionFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigableset {

	public static void main(String[] args) {
		
		NavigableSet obj = new TreeSet<>();
		
		
		obj.add(300);
		obj.add(10);
		obj.add(20);
		obj.add(10);
		obj.add(600);
		//obj.add(1000);
		obj.add(560);
		
		System.out.println(obj);
		
		//System.out.println(obj.floor(500));
		
		
		System.out.println(obj.floor(1000));
		
		

	}

}
