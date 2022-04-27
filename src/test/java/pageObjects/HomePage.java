package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class HomePage
   {
	WebDriver driver;
	
   public HomePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Elements
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement linkLogin;
	
	//Action Methods
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
		
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}
	}
	


