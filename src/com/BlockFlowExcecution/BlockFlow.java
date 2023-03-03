package com.BlockFlowExcecution;

public class BlockFlow {

	int i;
	String Name;
	int Roll_no;
	String clg_name;

	public BlockFlow(String name, String clg_name) {
		super();
		Name = name;
		this.clg_name = clg_name;
		System.out.println("constructor 1");

		class vaibhav {
			void m3() {
				System.out.println("inside constructor class");
			}
		}
		new vaibhav().m3();
	}

	public BlockFlow(String name, int roll_no) {
		super();
		Name = name;
		Roll_no = roll_no;
		System.out.println("constructor 2");
	}

	public BlockFlow(int i, String name) {
		super();
		this.i = i;
		Name = name;
		System.out.println("inside constructor 3");
	}

	static {

		class m1 {

			void m2() {
				System.out.println("inside static method");
			}

		}
		System.out.println("inside static block");
	}
	{
		class instance {

			void m1() {
				System.out.println("inside instance method");
			}

		}
		instance a = new instance();
		a.m1();
	}
	public static void main(String[] args) {
		BlockFlow p1 = new BlockFlow(10, "arvind");
		BlockFlow p2 = new BlockFlow("vaibhav", 20);
		BlockFlow p3 = new BlockFlow("vaibhav", "vpimsr");

	}

}

