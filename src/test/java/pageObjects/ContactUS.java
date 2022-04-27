package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUS 
{
	WebDriver driver;
    public ContactUS(WebDriver driver)
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
    
    @FindBy(xpath="//a[text()='Contact Us']")
    WebElement contact;
    
    @FindBy(xpath="//input[@value='Submit']")
    WebElement submit;
    
    @FindBy(xpath="//textarea[@name='enquiry']")
    WebElement enquiry;
    

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

     public void contact_us()
      {
	    contact.click();
	         }
     
     public void enquirymssg(String text)
     {
    	 enquiry.sendKeys(text);
     }
     public void submitbutton()
     {
    	 submit.click();
     }
     
}