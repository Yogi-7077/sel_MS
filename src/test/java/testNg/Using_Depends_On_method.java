package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Depends_On_method {
	@Test (dependsOnMethods = "register")
	public void login() {
		Reporter.log("Login",true);
	}
	@Test
	public void register() {
		
		Reporter.log("register",true);
	}
	@Test (dependsOnMethods = "register")
	public void create() {
		Reporter.log("Crete",true);
	}
	
}
