package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList 
{
   WebDriver driver;
   
   public WishList(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
	   @FindBy(name="search")
		 WebElement searchtxt;
		
		@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
		WebElement searchbutton;
		
		@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")
		WebElement wlist;
		
		//@FindBy(xpath="//a[@title='Wish List (1)']")
		@FindBy(xpath="//span[normalize-space()='Wish List (1)']")
		//@FindBy(xpath="//i[@class='fa fa-heart']")
		WebElement wlisticon;
		
		
		@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
		WebElement notfoun;

	
		
		
		public void search_txt(String text)
	      {
	    	  searchtxt.sendKeys(text);
	      }
		
		public void search_button() 
		{
			searchbutton.click();
		}
		
		public void wlist_button()
		{
			wlist.click();
		}
		
		public void wlist_icon()
		{
			wlisticon.click();
		}
		public boolean isPageExists()
		{
			try
			{
			return (notfoun.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
		}
		
   }  
   
       
   

