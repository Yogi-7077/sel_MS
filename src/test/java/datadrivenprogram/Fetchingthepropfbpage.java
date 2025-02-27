package datadrivenprogram;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchingthepropfbpage {

	public static void main(String[] args) throws IOException {
		FileInputStream common=new FileInputStream("./src/test/resources/commondata.properties");
		Properties pro=new Properties();
		pro.load(common);
		String username = pro.getProperty("username");
		String password=pro.getProperty("password");
		String fetchurl=pro.getProperty("url");
		String Time=pro.getProperty("time");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		long time=Long.parseLong(Time);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.get(fetchurl);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
