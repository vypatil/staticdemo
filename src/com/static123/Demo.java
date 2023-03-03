package com.static123;

import java.util.Arrays;

public class Demo {
	
	void m1() {
		System.out.println("m1 method");
		m2();
	}
	void m2() {
		System.out.println("m2 method");
		try {
			m3();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("do not divide by zero");
		}
	}
	void m3()throws ArithmeticException {
		System.out.println("m3 method"+10/0);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
}
	
}
	
