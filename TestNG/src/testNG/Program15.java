package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program15 {
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGoogle() {
		driver.get("http://www.google.com");
		String expected = "Google12";
		String actual = driver.getTitle();
		if(actual.equals(expected)) {
			Reporter.log("Google test is passed", true);
		}
		else {
			Reporter.log("Google test is failed", true);
			Assert.fail();
		}
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}


}
