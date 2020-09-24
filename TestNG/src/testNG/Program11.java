package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program11 {
	@AfterMethod
	public void m10()
	{
		System.out.println("@AfterMethod m10()");
	}
	
	@AfterClass
	public void m9()
	{
		System.out.println("@AfterClass m9()");
	}
	
	@Test
	public void m8()
	{
		System.out.println("@Test m8()");
	}
	
	@BeforeClass
	public void m6()
	{
		System.out.println("@BeforeClass m6()");
	}
	
	@BeforeMethod
	public void m7()
	{
		System.out.println("@BeforeMethod m7()");
	}

}
