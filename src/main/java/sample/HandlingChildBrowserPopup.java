package sample;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("mobiles"+Keys.ENTER);
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='MOTOROLA g05 (Plum Red, 64 GB)']")).click();
		Set<String> child = driver.getWindowHandles();
		for(String ele:child) {
			driver.switchTo().window(ele);
			if(driver.getTitle().contains("MOTOROLA g05 ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com")) {
				driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ _3Yl67G _7Pd1Fp\"]")).click();
				Thread.sleep(3000);
			}
		}
		driver.switchTo().window(parent);
		driver.quit();
	}
}
