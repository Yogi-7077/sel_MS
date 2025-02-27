package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingEnabledTag {
	@Test (enabled = false)
	public void dog() {
		Reporter.log("Dog",true);
	}
	
	@Test
	public void cat() {
		Reporter.log("Cat",true);
	}
	
	@Test (enabled = false)
	public void snake() {
		Reporter.log("Snake",true);
	}
}
