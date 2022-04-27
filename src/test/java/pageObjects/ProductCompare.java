package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCompare 
{
	
      WebDriver driver;
      
      public ProductCompare(WebDriver driver)
      {
    	  this.driver=driver;
    	  PageFactory.initElements(driver,this);
      }
      
      @FindBy(name="search")
		 WebElement searchtxt;
		
		@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
		WebElement searchbutton;
		
		@FindBy(xpath="//i[@class='fa fa-exchange']")
		WebElement productcompare;//productcompare icon
				
        @FindBy(xpath="//a[@id='compare-total']")
         WebElement productlink;
		
		public void search_txt(String text)
	      {
	    	  searchtxt.sendKeys(text);
	      }
		
		public void search_button() 
		{
			searchbutton.click();
		}
		
		public void product_compare()
		{
			productcompare.click();
		}
		
		public void productcopareicon()
		{
			productlink.click();
		}
		
      }
      

