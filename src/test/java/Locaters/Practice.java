
package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice{
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class=\"zDPmFV\" and @title=\"Search for products, brands and more\"]")).sendKeys("playstation"+Keys.ENTER);
	
		WebElement value =driver.findElement(By.xpath("//a[text()='SONY Playstation PS5 Charging Station | Charger Dock | ...' and @class=\"wjcEIp\"]/..//div[@class=\"UkUFwK\"]/span"));
		System.out.println(value.getText());
		driver.quit();
		}
}