package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword 
{
    WebDriver driver;
    
    public ForgotPassword(WebDriver driver)
    {
    	this.driver= driver;
    	PageFactory.initElements(driver,this);
    }	
    
    @FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
    
    @FindBy(linkText="Login")
	WebElement linkLogin;
    
    @FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
    
    	@FindBy(xpath="//a[text()='Forgotten Password']")
    	WebElement fpwd;
    	
    	@FindBy(xpath="//input[@id='input-email']")
    	WebElement email;
    	
    	@FindBy(xpath="//input[@value='Continue']")
    	WebElement con_tinue;
    	
    	public void clickMyAccount()
    	{
    		lnkMyaccount.click();
    	}
    	
    	public void clickLogin()
    	{
    		linkLogin.click();
    	}
    	
    	public void setEmail(String email)
    	{
    		txtEmailAddress.sendKeys(email);
    	}
    	
    	
    	public void forgotpwd() 
    	{
    		fpwd.click();
    	}
    	
    	public void femail(String text) 
    	{
    		email.sendKeys(text);
    	}
    	
    	public void continuebutton()
    	{
    		con_tinue.click();
    	}
}
    

