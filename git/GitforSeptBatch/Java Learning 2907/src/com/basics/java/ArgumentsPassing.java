package com.basics.java;

 public class ArgumentsPassing {
	 
	int var1 = 100;  //Global Variable
	
	public static void add(int a, int b)
	{
	
		System.out.println(a+b);
	}
	public static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mul(int var1, int var2)
	{
		System.out.println(var1*var2);
	}
	public void div(int x, int y) //Arguments or Parameters
	{
		add(7, 9);
		mul(5,6);
		System.out.println(x/y);
		System.out.println(x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgumentsPassing apObject = new ArgumentsPassing();
		apObject.mul(6, 9);
		apObject.mul(7, 5);
		apObject.div(5, 1);
		add(5, 9);
		add(8, 5);
		add(7, 5);
		sub(5,1);
	
		
		

	}

}
