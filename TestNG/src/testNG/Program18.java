package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Program18 {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String expected = "Dinga";
		String actual = driver.getTitle();
		//to fail a test script
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
		driver.close();
		s.assertAll(); // always should be last statement
		
	}

}
