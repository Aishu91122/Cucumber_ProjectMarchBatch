package parallelExecution;

import org.testng.annotations.Test;

public class MethodsLevel {
	
	@Test
	public void m1()
	{
		System.out.println("MethodsParallel1---->m1 "+Thread.currentThread().getId());
	}
	@Test
	public void m2()
	{
		System.out.println("MethodsParallel1---->m2 "+Thread.currentThread().getId());
	}
	@Test
	public void m3()
	{
		System.out.println("MethodsParallel1---->m3 "+Thread.currentThread().getId());
	}
	@Test
	public void m4()
	{
		System.out.println("MethodsParallel1---->m4 "+Thread.currentThread().getId());
	}
	@Test
	public void m5()
	{
		System.out.println("MethodsParallel1---->m5 "+Thread.currentThread().getId());
	}

}
