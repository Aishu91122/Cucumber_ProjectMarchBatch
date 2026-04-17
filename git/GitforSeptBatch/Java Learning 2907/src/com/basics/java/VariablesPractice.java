package com.basics.java;

public class VariablesPractice {
	
	static 
	{
	  System.out.println("I am Static Block");
	}
	{
		System.out.println("I am Instance");
	}
	public VariablesPractice()
	{
		System.out.println("I am a constructor");
	}
	
	String a;                   //Global Variable
	static int b=100;           // static Global variable
	public static void m1()
	{
		int a=10;  // Local Variable
		System.out.println(a);
		new VariablesPractice().m4();
	}
	public static void m2()
	{
		System.out.println(new VariablesPractice().a);
		System.out.println(VariablesPractice.b);
		
	}
	public static void m3()
	{
				
		new VariablesPractice().m6();
	}
	public void m4()
	{
		System.out.println(new VariablesPractice().a);
		System.out.println(VariablesPractice.b);
		
	}
	public void m5()
	{
		int a=50;  // Local Variable
		System.out.println(a);
		VariablesPractice.m2();
	}
	public void m6()
	{
		System.out.println(new VariablesPractice().a);
		System.out.println(VariablesPractice.b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		b = 2;
		System.out.println(b);
		VariablesPractice.m1();
		new VariablesPractice().m5();
		VariablesPractice.m3();

	}

}
