package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCertificate
{
			  WebDriver driver;
		  public GiftCertificate(WebDriver driver)
		    {
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
		     }  
		      @FindBy(xpath="//a[contains(text(),'Gift Certificates')]")
              WebElement  giftcertificate;
		      @FindBy(xpath="//input[@name='to_name']")
              WebElement Rname;
		      @FindBy(xpath=" //input[@name='to_email']")
		      WebElement Remail;
		      @FindBy(xpath=" //input[@name='from_name']")
		      WebElement fromname;
		      @FindBy(xpath=" //input[@name='from_email']")
		      WebElement fromemail;
		      @FindBy(xpath=" //input[@value='6']")
		      WebElement radio;
		      @FindBy(xpath="//textarea[@name='message']")
		      WebElement mssg;
		      @FindBy(xpath="//input[@name='amount']")
		      WebElement amount;
		      @FindBy(xpath="//input[@name='agree']")
		      WebElement agree;
		      @FindBy(xpath="//input[@value='Continue']")
		      WebElement conti;
		      
        public  void gift()
        {
	     giftcertificate.click();
        }
       public void recname(String text)
       {
    	   Rname.sendKeys(text);
       }
   
       public void email(String text)
       {
    	   Remail.sendKeys(text);
       }
       public void yourname(String text)
       {
    	   fromname.sendKeys(text);
       }
       
       public void youremail(String text)
       {
    	   fromemail.sendKeys(text);
       }
       public void radiobutton()
       {
    	   radio.click();
       }  
       
       public void message(String text)
       {
    	   mssg.sendKeys(text);
       }
       
       public void ramount(String text)
       {
    	   amount.clear();
    	   amount.sendKeys(text);
            }
       
       public void chkagree()
       {
    	       	   agree.click();
            }
       public void continuebutton()
       {
    	   conti.click();
            }
     }

