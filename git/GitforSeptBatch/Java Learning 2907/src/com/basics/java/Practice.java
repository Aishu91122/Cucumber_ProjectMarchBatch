package com.basics.java;

public class Practice {
	
	public Practice() {
		System.out.println("I am a Constructor");
	}
	public static void m1()
	{
		System.out.println("I am static method 1");
	}
	public void m2()
	{
		System.out.println("I am an instance method 2");
	}
	static {
		System.out.println("I am a static Block");
	}
	{
		System.out.println("I am An instance Block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice.m1();  //Method Calling
		new Practice().m2(); //Instance method calling statement

	}

}
