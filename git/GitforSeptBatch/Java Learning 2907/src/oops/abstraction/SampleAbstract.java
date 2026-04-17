package oops.abstraction;

public abstract class SampleAbstract {
	
	static int a =10;
	
	int b = 20; 
	
	public static void m1()
	{
		System.out.println("Static Method");
	}
	
	public void m2()
	{
		System.out.println("Instance Methods");
	}
	
	public abstract void m3();
	
	
	static 
	{
		System.out.println("Static Block");
	}
	
	
	{
		System.out.println("Instance Block");
	}
	
	public SampleAbstract()
	{
		System.out.println("I am A Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
