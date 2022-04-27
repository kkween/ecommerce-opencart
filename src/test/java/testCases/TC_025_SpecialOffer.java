package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SpecialOffer;
import testBase.BaseClass;

public class TC_025_SpecialOffer extends BaseClass
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
			
			SpecialOffer sp=new SpecialOffer(driver);
			sp.specialoffer();
			logger.info("Click on Specials Link");
			Thread.sleep(3000);
			sp.addtocart();
			logger.info("Click on Add to Cart");
			Thread.sleep(3000);
			sp.add_cart();
			logger.info("Add to Cart");
			Thread.sleep(3000);
}
}