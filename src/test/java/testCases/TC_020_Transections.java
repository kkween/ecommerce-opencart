package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Transections;
import testBase.BaseClass;

public class TC_020_Transections  extends BaseClass
{
	@Test
public void test_transections() throws InterruptedException
{
		logger.info(" Starting TC_016_OrderHistory");
		   
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
			
			Transections tr =new Transections(driver);
					tr.tran_sections();
			logger.info("Clicked on Transections");
			Thread.sleep(3000);
			
			logger.info("Finished TC_020_Transections");
}
}
