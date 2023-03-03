package com.static123;

public class Basic {
	
	static String university;
	String college_name;
	String student_name;
	int prn_no;
	float marks;

	public Basic(String college_name, String student_name, int prn_no, float marks) {
		super();
		this.college_name = college_name;
		this.student_name = student_name;
		this.prn_no = prn_no;
		this.marks = marks;
	}

	public static void main(String[] args) {
		
		Basic b1 = new Basic ("Ghodawat","vaibhav",2017,70.12f);
		
		System.out.println(b1.college_name+ "   "+ b1.student_name+"   " + b1.prn_no+"  "   + b1.marks);
		
		Basic b2 = new Basic ("shiavji university", "shreysh",2018,80.80f);
		
		System.out.println(b2.college_name+ "   "+ b2.student_name+ "   " + b2.prn_no+ "  " + b2.marks);
		
		Basic b3 = new Basic ("balaji english medium school","shreyash",2011,71.72f);
		
		System.out.println(b3.college_name+ "  "+ b3.student_name+ "  "+ b3.prn_no+ "  "+b3.marks);
	
	
		
		
		
	}

}
