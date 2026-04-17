package com.basics.java;

public class MethodsPractice {
	
	static boolean a;   //static Global Variable
	int b=10;           //instance Global Variable
		
	public static void m1()
	{
		int var1 = 10;  //Local Variables
		int var2 = 20;
		System.out.println(var1+var2);
		System.out.println(MethodsPractice.a);
	}
	public static void m2()
	{
		int a=400;
		int b=50;    //Local Variables
		System.out.println(a-b);
		System.out.println(new MethodsPractice().b);
		
	}
	public void m3()
	{
		int var1=49;
		int var2=99;
		System.out.println(var1*var2);
		System.out.println(MethodsPractice.a);
		
	}
	public void m4()
	
	{
		int a =100;
		int b=20;
		System.out.println(a/b);
		System.out.println(new MethodsPractice().b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgumentsPassing obj	=  new ArgumentsPassing(); //Object Creation with reference
        obj.div(7, 5);
		
		System.out.println(MethodsPractice.a);   // Variable Calling
		System.out.println(new MethodsPractice().b);
		MethodsPractice.m1();   //method calling 
		MethodsPractice.m2();
		new MethodsPractice().m3(); 
		new MethodsPractice().m4();

	}

}
