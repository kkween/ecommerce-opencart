package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Returns 
{
	WebDriver driver;
    public Returns(WebDriver driver)
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
		
		@FindBy(xpath="//a[text()='Returns']")
		WebElement returns;
		
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
		
		public void itemreturn()
		{
			returns.click();
		}
}
