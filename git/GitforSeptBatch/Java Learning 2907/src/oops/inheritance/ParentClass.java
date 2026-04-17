package oops.inheritance;

public  class ParentClass {
	
	String s1 = "Selenium" ;  //Global Variables
	
	static String s2 = "TestNG";
	
	public static void m1()
	{
		System.out.println("M1 Method from Parent Class");
	}
	
	public static void m2()
	{
		System.out.println("M2 Method from Parent Class");
	}
	
	public void m3()
	{
		System.out.println("M3 from Parent Class"+(s1+s2));
	}
	
	public ParentClass()
	{
		System.out.println("I am Parent Class Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
