package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecialOffer
{

	WebDriver driver;
    public SpecialOffer(WebDriver driver)
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
	
	@FindBy(xpath="//a[text()='Specials']")
	WebElement specials;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	WebElement addcart;
	
	@FindBy(xpath="//button[contains(text(),'Add to Cart')]")
	WebElement acart;
	
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
     public void specialoffer()
     {
    	 specials.click();
     }
     
     public void addtocart()
     {
    	 addcart.click();
     }
     public void add_cart()
     {
    	 acart.click();
     }
}
