package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword 
{
	WebDriver driver;
	
	public ChangePassword(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Change your password']")
	WebElement changepwd;
	
	@FindBy(xpath="//input[@name='password']")//before changing password
	WebElement beforepwd;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement pwdconfm;
	
	@FindBy(xpath="//a[text()='Back']")
	WebElement backhomepage;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement contin;
	
	
	public void setEmail(String email)
    {
	    txtEmailAddress.sendKeys(email);
     }

   public void setPassword(String pwd)
     {
	    txtPassword.sendKeys(pwd);
     }

    public void clickLogin()
    {
	     btnLogin.click();
    }
    
    public void change_pwd()
    {
	     changepwd.click();
    }
    public void before_pwd(String text) 
    {
    	beforepwd.click();
    	beforepwd.sendKeys(text);
    }

    public void pwd_confm(String text)
    {
    	pwdconfm.clear();
	     pwdconfm.sendKeys(text);
    }
    public void back_homepage()
    {
    	backhomepage.click();
    }
    public void continbutton()
    {
    	contin.click();
    }
}
