package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Program17 {
	@BeforeMethod
	public void abc() {
		System.out.println("from abc");
	}
	@Test
	public void pqr() {
		System.out.println("pqr begins");
		System.out.println("pqr ends");
	}
	@Test
	public void mno() {
		SoftAssert s = new SoftAssert();
		System.out.println("mno begins");
		s.assertEquals("hii", "bye");
		System.out.println("mno ends"); //will be executed
		s.assertAll();
	}
	@AfterMethod
	public void xyz() {
		System.out.println("from xyz");
	}

}
