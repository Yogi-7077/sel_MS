package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
	@Test (priority = 3)
	public void apple() {
		Reporter.log("tested Apple",true);
	}
	@Test (priority = 1)
	public void orange() {
		Reporter.log("tested Orange",true);
	}
	@Test(priority = 2,invocationCount = 10)
	public void watermelon() {
		Reporter.log("Tested Watermelon",true);
	}
	@Test(priority = 5)
	public void pineaple() {
		Reporter.log("Tested Pineapple",true);
	}
	@Test(priority = 4)
	public void guava() {
		Reporter.log("Testing Guava",true);
	}
}
