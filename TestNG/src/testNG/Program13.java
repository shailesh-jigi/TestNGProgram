package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program13 {
	WebDriver driver ;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
	}
	
	@Test
	public void google()
	{
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		Reporter.log(title, true);		
	}
	
	@Test
	public void fb()
	{
		driver.get("http://www.fb.com");
		String title = driver.getTitle();
		Reporter.log(title, true);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
