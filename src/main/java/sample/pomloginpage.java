package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomloginpage {

	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(id="pass")
	private WebElement PS;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbutton ;
	
	@FindBy(xpath="//h2")
	private WebElement header;
	
	public pomloginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public WebElement getun() {
		return un;
	}
	public void getpass(String pass) {
		PS.sendKeys(pass);
	}
	public void getLogin_btn() {
		loginbutton.click();
	}
	public String getHeader() {
		return header.getText();
	}
}
