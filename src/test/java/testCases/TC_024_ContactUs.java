package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUS;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_024_ContactUs extends BaseClass
{
	@Test
	  public void test_contactus() throws InterruptedException 
	  {
		  logger.info(" Starting TC_015_AddressBook");
		   
		   driver.get(rb.getString("appURL"));
					
			logger.info("Home Page Displayed ");
			
			driver.manage().window().maximize();
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account ");
			hp.clickLogin();
			logger.info("Clicked on Login ");
			
			LoginPage lp=new LoginPage(driver);
			
			lp.setEmail(rb.getString("email"));
			logger.info("Provided Email ");
			
			lp.setPassword(rb.getString("password"));
			logger.info("Provided Password ");
			
			lp.clickLogin();
			logger.info("Clicked on Login");
			Thread.sleep(3000);
			
			ContactUS cu = new ContactUS(driver);
			cu.contact_us();
			logger.info("click on Contact Us Link");
			Thread.sleep(2000);
			
			cu.enquirymssg("This is the enquiry of iMac");
			logger.info("Entered Enquiry Message");
			Thread.sleep(2000);
			
			cu.submitbutton();
			logger.info("click on Submit Button");
			Thread.sleep(2000);
			logger.info("Finished TC_024_CotactUs");
			
					
}
}