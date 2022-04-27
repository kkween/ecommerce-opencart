package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderFooterMenuOptions 
{
  WebDriver driver;
  public HeaderFooterMenuOptions(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  
     }
  
     @FindBy(xpath="//a[text()='Brands']")
     WebElement brands;
     @FindBy(xpath="//a[text()='Canon']")
     WebElement canon;
     @FindBy(xpath="//button[@class='btn btn-default active']")//grid view
     WebElement gridview;
     @FindBy(xpath="//i[@class='fa fa-exchange']")
     WebElement procompare;
     
     public void brand()
     {
    	 brands.click();
     }
     
     public void cannonlink()
     {
    	 canon.click();
     }
     public void grid()
     {
    	 gridview.click();
     }
     public void productcompare()
     {
    	 procompare.click();
     }
     }
     

