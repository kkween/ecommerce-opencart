package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountinformation
{
		WebDriver driver;
		
		public MyAccountinformation(WebDriver driver)
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
		
		@FindBy(xpath="//a[text()='Edit your account information']")
		WebElement editacct;
		
		@FindBy(xpath="//input[@name='telephone']")
		WebElement edittel;


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

      public void edit_acct()
      {
	   editacct.click();
        }
      public void edit_tele(String text)
      {
    	  edittel.clear();
    	  edittel.sendKeys(text);
      }
      }
      
