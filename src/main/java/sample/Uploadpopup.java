package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(5000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\yogid\\OneDrive\\Desktop\\nothing\\SQL NOTES.txt");
				//filejihih.sendKeys("");//change sendkeys
		Thread.sleep(5000);
	}

}
