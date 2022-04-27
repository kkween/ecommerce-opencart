package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RecurringPayment;
import pageObjects.Transections;
import testBase.BaseClass;

public class TC_021_RecurringPayment extends BaseClass
{
@Test
public void test_RecurringPayment() throws InterruptedException
{
		logger.info(" Starting TC_021_RecurringPayment");
		   
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
			
		RecurringPayment rp =new RecurringPayment(driver);
					rp.Recurring_Payment();
			logger.info("Clicked on Recurring Payement");
			Thread.sleep(3000);
			
			logger.info("Finished TC_021_RecurringPayment");
}

}
