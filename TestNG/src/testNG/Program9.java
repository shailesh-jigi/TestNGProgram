package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program9 {
	
	@Test
	public void apple()
	{
		System.out.println("from @Test apple()");
	}
	
	@Test
	public void pineApple()
	{
		System.out.println("from @Test pineApple()");
	}

	
	@BeforeMethod
	public void banana()
	{
		System.out.println("from @BeforeMethod banana()");
	}
	
	@AfterMethod
	public void zebra()
	{
		System.out.println("from @AfterMethod zebra()");
	}


}
