package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")).sendKeys("Hyder");
		
	}

}
