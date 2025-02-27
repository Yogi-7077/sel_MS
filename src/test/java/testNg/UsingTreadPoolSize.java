package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingTreadPoolSize {
	@Test(threadPoolSize = 2,invocationCount = 3)
	public void apple() {
		Reporter.log("apple",true);
	}
	
	//Making 2 thread and working 3 times like 1. thread=1 invocation=1,2. thread=2 invocation=2,3. thread=1 and invocation =3
	
	@Test(threadPoolSize = 3,invocationCount = 4)
	public void banana() {
		Reporter.log("Banana",true);
	}
}
