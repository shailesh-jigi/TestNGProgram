package testNG;

import org.testng.annotations.Test;

public class Program6 {
	@Test(invocationCount=2)
	public void apple()
	{
		System.out.println("from apple method");
	}
	
	@Test(invocationCount=3)
	public void dog()
	{
		System.out.println("from dog method");
	}
	
	@Test(invocationCount=4)
	public void bat()
	{
		System.out.println("from bat method");
	}
	
	@Test(invocationCount=5)
	public void mango()
	{
		System.out.println("from mango method");
	}

}
