package oops.polymorphism;

public class MethodOverlaoding {
	
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void add(float a, float b)
	{
		System.out.println(a+b);
	}
	public static void add(char a, char b)
	{
		System.out.println(a+b);
	}
	public static void add(boolean a, boolean b)
	{
		System.out.println(a + " Boolean Values "+ b);
	}
	public static void add(String a, String b)
	{
		System.out.println(a+b);
	}
	public static void add(long a, long b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverlaoding.add(true, false);
		MethodOverlaoding.add('r', 't');
		MethodOverlaoding.add(6.7f, 8.7f);
		MethodOverlaoding.add(3, 4);
		MethodOverlaoding.add(437867l, 539475943548l);
		MethodOverlaoding.add("Java", "Selenium");

	}

}
