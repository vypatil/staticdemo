package com.stringclass;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		String s1 = new String ("helloworld");
		
		String s2 = "hello";		
		
		String s3 = "world";
		
		// concatination is always create new object on heap.(outside scp)
		String s4 = s2.concat(s3);
		
		String s5 = "helloworld";
		String s6 = "helloworld";
				
		System.out.println(s1==s4);
		
		System.out.println(s1==s5);
		
		System.out.println(s5.equals(s6));
		
	}
}
