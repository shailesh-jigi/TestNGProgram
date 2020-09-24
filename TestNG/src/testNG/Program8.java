package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program8 {
	@Test
	public void apple()
	{
		System.out.println("from @Test apple()");
	}
	
	@BeforeTest
	public void banana()
	{
		System.out.println("from @BeforeTest banana()");
	}
	
	@AfterTest
	public void zebra()
	{
		System.out.println("from @AfterTest zebra()");
	}



}
