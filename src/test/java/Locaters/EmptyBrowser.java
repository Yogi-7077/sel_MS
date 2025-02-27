package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("./html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("yogidon789&gmail.com");
		driver.findElement(By.xpath("./html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input")).sendKeys("Yogidon789");
		driver.findElement(By.xpath("./html/body/div/div/div/div/div/div/div/div/div/form/div[2]/button")).click();
		
		}
}

