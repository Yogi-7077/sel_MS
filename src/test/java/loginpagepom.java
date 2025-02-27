package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pomloginpage;

public class loginpagepom {

	public static void main(String[] args) throws IOException,InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	FileInputStream fis=new FileInputStream("");
	Properties p=new Properties();
	p.load(fis);
	String URL=p.getProperty("url");
	String Un=p.getProperty("username");
	String PASSWORD=p.getProperty("password");
	pomloginpage l=new pomloginpage(driver);
	driver.get(URL);
	if(l.getHeader().contains("Facebook helps you")) {
		l.getun().sendKeys(Un);
		l.getpass(PASSWORD);
		driver.navigate().refresh();
		l.getun().sendKeys(Un);
		l.getpass(PASSWORD);
		l.getLogin_btn();
	}
	}
///    incomplte
///
///
///
///
///
///
///
}
