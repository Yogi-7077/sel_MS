//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Popup {
//
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert popup = driver.switchTo().alert();
//		System.out.println(popup.getText());//sysout
//		popup.accept();
//		System.out.println(driver.findElement(By.id("result")).getText());
//	}
//}
//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Popup{
//	public static void main(String[] args) {
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//		Alert popup = driver.switchTo().alert();
//		System.out.println(popup.getText());
//		popup.accept();
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//				}
//}
//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Popup{
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		driver.switchTo().alert().dismiss();
//		WebElement result = driver.findElement(By.id("result"));
//		System.out.println(result.getText());
//		driver.quit();
//	}
//}
//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Popup{
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Alert pop = driver.switchTo().alert();
//		pop.sendKeys("selenium");
//		pop.accept();
//		WebElement result = driver.findElement(By.id("result"));
//		System.out.println(result.getText());
//	}
//}