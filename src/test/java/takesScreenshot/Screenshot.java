//package takesScreenshot;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
public class Screenshot {

	//changes done in github
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		//step 1:typecasting takescreenshot(i) with driver.v
		TakesScreenshot ts=(TakesScreenshot)driver;
		//step 2:Take the sceenshot and store it in temp file
		File src=ts.getScreenshotAs(OutputType.FILE);
		//Step 3:Create an empty file
		File dest=new File("./screenshot/flipkart.png");
		FileUtils.copyFile(src, dest);
		driver.quit();
	}
}
//package takesScreenshot;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Screenshot{
//	public static void main(String[] args) throws IOException {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.flipkart.com/");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("./ss/flip.png");
//		FileUtils.copyFile(src, dest);
//		driver.quit();
//	}
//}
//package takesScreenshot;
//
//import java.time.Duration;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Screenshot{
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.ajio.com/");
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(100,1700)");
//		Thread.sleep(3000);
//		driver.quit();
//		
//	}
//}
package takesScreenshot;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ajio.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1700)");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//strong[tet()='100% HANDPICKED']"));
		js.executeScript("arguments[0].scrollIntoview(true)",ele);
		Thread.sleep(3000);
		driver.quit();
	}
}

