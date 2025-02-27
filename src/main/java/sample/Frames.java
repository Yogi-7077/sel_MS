//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Frames {
//
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.zomato.com/");
//		driver.findElement(By.linkText("Log in")).click();
//		driver.switchTo().frame("auth-login-ui");
//		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("7077529101");
//		//close the frames
//		driver.findElement(By.xpath("//*[name()='svg'][@class=\"sc-rbbb40-0 fJjczH\"]")).click();
//		//switch the driver control to the main webpage
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//input[@placeholder=\"Search for restaurant, cuisine or a dish\"]")).sendKeys("Biryani");
//		driver.quit();
//	}
//
//}
//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Frames{
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.snapdeal.com/");
//		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
//		driver.findElement(By.xpath("//a[text()='login']")).click();
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("7077529101");
//		driver.findElement(By.xpath("//div[@id=\"close-pop\"]")).click();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//input[@class=\"col-xs-20 searchformInput keyword\"]")).sendKeys("playstation"+Keys.ENTER);
//		driver.quit();
//	}
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
//public class Frames{
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.snapdeal.com/");
//		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
//		driver.findElement(By.xpath("//a[text()='login']")).click();
//		WebElement framemove = driver.findElement(By.id("loginIframe"));
//		driver.switchTo().frame(framemove);
//		driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly']")).sendKeys("7077529101");
//		driver.findElement(By.id("close-pop")).click();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']")).sendKeys("playstation");
//		driver.quit();
//	}
//}