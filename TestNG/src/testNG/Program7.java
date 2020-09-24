package testNG;

import org.testng.annotations.Test;

public class Program7 {
	@Test(priority=4, invocationCount=4)
	public void apple()
	{
		System.out.println("from apple method");
	}
	
	@Test(priority=2, invocationCount=2)
	public void dog()
	{
		System.out.println("from dog method");
	}
	
	@Test(priority=3, invocationCount=3)
	public void bat()
	{
		System.out.println("from bat method");
	}
	
	@Test(priority=1)
	public void mango()
	{
		System.out.println("from mango method");
	}

}
