package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program2 {
	@Test
	public void apple() {
		Reporter.log("from apple()");
	}
	@Test
	public void banana() {
		Reporter.log("from banana()");
	}
	
	@Test
	public void orange() {
		Reporter.log("from orange()");
	}

}
