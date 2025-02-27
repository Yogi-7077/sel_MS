package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRACTICE {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s25 ultra"+Keys.ENTER);
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy S25 Ultra 5G AI Smartphone (Titanium Whitesilver, 12GB RAM, 256GB Sto')]")).click();
	    driver.findElement(By.id("add-to-cart-button")).click();
	    
	}

}
