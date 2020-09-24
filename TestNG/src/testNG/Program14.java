package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program14 {
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGoogle() throws IOException {
		driver.get("http://www.google.com");
		String expected = "Google12";
		String actual = driver.getTitle();
		if(actual.equals(expected)) {
			Reporter.log("Google test is passed", true);
		}
		else {
			Reporter.log("Google test is failed", true);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("./photo/e1.png");
			FileUtils.copyFile(src,des);
		}
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
