package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newsletter
{
	WebDriver driver;
    public Newsletter(WebDriver driver)
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
		
		@FindBy(xpath="//a[text()='Newsletter']")
		WebElement newsletter;
		
		@FindBy(xpath="//input[@value='1']")
		WebElement radiobutton;//yes button
		
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
		
		public void News_Letter()
		{
			newsletter.click();
		}
		
		public void radio_button()
		{
			radiobutton.click();
		}
		
		public void continbutton()
		{
			contin.click();
		}
}
