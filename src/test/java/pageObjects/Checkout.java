package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout
{

	WebDriver driver;
	
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
	     @FindBy(name="search")
		 WebElement searchtxt;
		
		@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
		WebElement searchbutton;
		
		@FindBy(xpath="//span[normalize-space()='Add to Cart']")
		WebElement addcart;
		
		@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
				WebElement viewcart;
		
		@FindBy(xpath="//span[text()='Shopping Cart']")
		WebElement shopingcart;

		@FindBy(xpath="//a[text()='Checkout']")
		WebElement checkout;
		
		@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
		WebElement msgconfm;
		
		public void searchtxt(String text)
	      {
	    	  searchtxt.sendKeys(text);
	      }
		
		public void searchbutton() 
		{
			searchbutton.click();
		}
		public void addcart()
		{
			addcart.click();
		}
		
		public void viewcart()
			{
				viewcart.click();
				}
		
		public void shop_cart()
		{
			shopingcart.click();
		}
		
		public void check_out()
		{
			checkout.click();
		}
		
		public boolean isPageExists()
		{
			try
			{
			return (msgconfm.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
		}
}
