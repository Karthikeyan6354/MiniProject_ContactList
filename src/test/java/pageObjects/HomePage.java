package pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
		
	public HomePage(WebDriver driver) {
		super(driver);
		this.mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	@FindBy (xpath="//button[@id='signup']")
	private WebElement btn_SignUp;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement txt_loginemail;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement txt_password;
	
	@FindBy (xpath="//button[@id='submit']")
	private WebElement btn_submit;
	
	@FindBy (xpath="//button[@id='logout']")
	private WebElement btn_logout;
	
	public void set_Loginemail(String email) {
		mywait.until(ExpectedConditions.visibilityOf(txt_loginemail)).sendKeys(email);
	}
	
	public void set_Password(String pwd) {
		mywait.until(ExpectedConditions.visibilityOf(txt_password)).sendKeys(pwd);
	}
	
	public boolean IsSignUpButtonVisible() {
		return mywait.until(ExpectedConditions.visibilityOf(btn_SignUp)).isDisplayed();		
	}
	
	public boolean IsSignUpButtonClickable() {		
		return mywait.until(ExpectedConditions.elementToBeClickable(btn_SignUp)).isEnabled();
	}
	
	public void Click_SignUpButton() {
		mywait.until(ExpectedConditions.elementToBeClickable(btn_SignUp)).click();
	}
	
	public boolean IsLoginButtonVisible() {
		return mywait.until(ExpectedConditions.visibilityOf(btn_submit)).isDisplayed();		
	}
	
	public boolean IsLoginButtonClickable() {		
		return mywait.until(ExpectedConditions.elementToBeClickable(btn_submit)).isEnabled();
	}
	
	public void Click_LoginButton() {
		mywait.until(ExpectedConditions.elementToBeClickable(btn_submit)).click();
	}
	
	public void Click_LogOutButton() {
		mywait.until(ExpectedConditions.elementToBeClickable(btn_logout)).click();
	}
	
	
	
	
	

}
