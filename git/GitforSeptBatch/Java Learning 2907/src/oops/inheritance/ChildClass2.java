package oops.inheritance;

public class ChildClass2 extends ParentClass{
	
	int a = 20;
	
	static int b = 33;
	
	public static void m7()
	{
		
		System.out.println("M7 Method from GrandChild Class");
	}
	
	public static void m8()
	{
		System.out.println("M8 Method from GrandChild Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChildClass2 gc = new ChildClass2();
		ChildClass2.m1();
		
		ChildClass2.m8();
		System.out.println(gc.b);
		

	}

}
