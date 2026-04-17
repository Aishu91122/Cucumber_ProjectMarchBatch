package exceptionHandling;

public class CompileTime {
	
	
	public static void m1() throws InterruptedException
	{
		System.out.println(1);
		Thread.sleep(1000);
		System.out.println(2);
		Thread.sleep(1000);
		System.out.println(3);
		Thread.sleep(1000);
		System.out.println(4);
		Thread.sleep(1000);
		System.out.println(5);
		Thread.sleep(1000);
		System.out.println(6);
		Thread.sleep(1000);
		System.out.println(7);
		Thread.sleep(1000);
		System.out.println(8);
		Thread.sleep(1000);
		System.out.println(9);
		Thread.sleep(1000);
		System.out.println(10);
	}

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		CompileTime.m1();

	}

}
