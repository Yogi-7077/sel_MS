//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class Notificationpopup {
//
//	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
//		Thread.sleep(4000);
//		driver.findElement(By.id("browNotButton")).click();
//		driver.quit();
//	}
//}
//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class Notificationpopup{
//	public static void main(String[] args) {
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notification");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("http://the-internet.herokuapp.com/geolocation");
//		driver.findElement(By.xpath("//button[text()='Where am I?']"));
//	}
//}