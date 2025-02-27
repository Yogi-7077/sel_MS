package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingpriorityFlag {
	@Test (priority = 3)
	public void apple() {
		Reporter.log("tested Apple",true);
	}
	@Test (priority = 1)
	public void orange() {
		Reporter.log("tested Orange",true);
	}
	@Test(priority = 2)
	public void watermelon() {
		Reporter.log("Tested Watermelon",true);
	}
	@Test(priority = 4)
	public void pineaple() {
		Reporter.log("Tested Pineapple",true);
	}
}
