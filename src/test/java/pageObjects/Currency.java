package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class Currency 
  {
     WebDriver driver;
	
	public Currency(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	 @FindBy(xpath="//span[normalize-space()='Currency']")
	 WebElement currency;
	 @FindBy(xpath="//button[text()='$ US Dollar']")
	 WebElement dollar;
	 
	 public void currencylink()
	 {
		 currency.click();
	 }
	 
	 public void USdollar()
	 {
		 dollar.click();
	 }
	 
	 
}
