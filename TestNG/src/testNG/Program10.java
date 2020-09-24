package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program10 {
	@AfterMethod
	public void m3()
	{
		System.out.println("@AfterMethod m3()");
	}
	
	@AfterClass
	public void m5()
	{
		System.out.println("@AfterClass m5()");
	}
	
	@Test
	public void m1()
	{
		System.out.println("@Test m1()");
	}
	
	@BeforeClass
	public void m4()
	{
		System.out.println("@BeforeClass m4()");
	}
	
	@BeforeMethod
	public void m2()
	{
		System.out.println("@BeforeMethod m2()");
	}




}
