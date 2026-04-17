package oops.inheritance;

public class ChildClass extends ParentClass{
	
	int a = 10;
	
	static int b =20;
	
	public static void m4()
	{
		System.out.println("M4 Method from Child Class");
	}
	
	public static void m5()
	{
		System.out.println("M5 Method from Child Class");
	}
	
	public void m6()
	{
		System.out.println("M6 from Child Class"+(a+b));
	}
	
	public ChildClass()
	{
		this(10); 
		System.out.println("I am a Child Class Constructor");
	}
	
	public ChildClass(int a)
	{
		super();  //within a constructor , Parent Class Constructor Calling Statement
		System.out.println("Child Constructor with one argument");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass cc = new ChildClass();
		cc.m1();
		
	
		

	}

}
