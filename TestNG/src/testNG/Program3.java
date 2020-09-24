package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program3 {
	
	@Test
	public void apple() {
		Reporter.log("from apple()",false);
	}
	
	@Test
	public void banana() {
		Reporter.log("from banana()",true);
	}
	
	@Test
	public void orange() {
		Reporter.log("from orange()",true);
	}

}
