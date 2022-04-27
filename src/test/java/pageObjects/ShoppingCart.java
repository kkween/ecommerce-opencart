package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart 
{
     WebDriver driver;
     public ShoppingCart(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
         }
     
     @FindBy(name="search")
	 WebElement searchtxt;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	WebElement addcart;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	WebElement shopingcart;
	
	@FindBy(xpath="//a[normalize-space()='Use Coupon Code']")
			WebElement drpselect;
	
	@FindBy(xpath="//input[@id='input-coupon']")
	WebElement textbox;
	//drowpdown2
	@FindBy(xpath="//a[text()='Estimate Shipping & Taxes ']")
    WebElement shipi;
    
    @FindBy(id="input-country")
    WebElement select;
    
    @FindBy(id="input-zone")
    WebElement selectzone;
    
    @FindBy(id="input-postcode")
    WebElement postcode;
    
    @FindBy(xpath="//button[@id='button-quote']")
    WebElement getquote;
    
    @FindBy(xpath="//input[@name='shipping_method']")
    WebElement radio;
    
    @FindBy(xpath="//input[@value='Apply Shipping']")
    WebElement applyship;
    
 //dropdown3
	@FindBy(xpath="//a[text()='Use Gift Certificate ']")
	WebElement gift;
	
	@FindBy(xpath="//input[@id='input-voucher']")
	WebElement giftcerti;
	
	@FindBy(xpath="//input[@value='Apply Gift Certificate']")
	WebElement applygc;
	
	//continue button
	@FindBy(xpath="//a[normalize-space()='Continue Shopping']")
	WebElement con_button;
	
	public void searchtxt(String text)
    {
  	  searchtxt.sendKeys(text);
    }
	
	public void searchbutton() 
	{
		searchbutton.click();
	}
	
	public void addtocart()
	{
		addcart.click();
	}
     
	public void shop_cart()
	{
		shopingcart.click();
	}
	
	public void dropdown()
	{
		drpselect.click();
		
		}
	
	public void drptext(String text)
	{
		textbox.sendKeys(text);
	}

	public void drpdown2()
	{
		shipi.click();
	}

	public void  select_list()
	{
	      Select coun= new Select(driver.findElement(By.id("input-country")));
      coun.selectByVisibleText("Togo");
		}

	public void  select_list2()
	{
	      Select zone= new Select(driver.findElement(By.id("input-zone")));
      zone.selectByVisibleText("Kara");
		}
	
	public void  select_text(String text)
	{
	      postcode.sendKeys(text);
			}
	public void select_getquote()
	{
		getquote.click();
	}
	
	public void select_radio()
	{
		radio.click();
	}
	
	public void select_applyship()
	{
		applyship.click();
	}
	public void select_gift()
	{
		gift.click();
	}
	
	public void select_giftcertifi(String text)
	{
		giftcerti.sendKeys(text);
	}
	
	public void select_buttongc() 
	{
		applygc.click();
	}
	
	public void click_continue()
	{
		con_button.click();
	}
}