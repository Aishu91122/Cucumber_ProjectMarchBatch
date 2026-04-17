package testNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsOrder {
	
	@Test
	public void test()
	{
		System.out.println("Test Annoatation");

	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite Annotation");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite Annotation");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest Annotation");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest Annotation");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod Annotation");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod Annotation");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass Annotation");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass Annotation");
	}


}
