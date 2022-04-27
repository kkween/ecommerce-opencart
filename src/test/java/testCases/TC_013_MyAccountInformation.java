package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountinformation;
import testBase.BaseClass;

public class TC_013_MyAccountInformation extends BaseClass
{
	 @Test
	 public void test_MyAccountInformation() throws InterruptedException
	 {
		 logger.info(" Starting TC_013_MyAccountInformation ");
		   
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
			
			MyAccountinformation mai=new MyAccountinformation(driver);
			mai.edit_acct();
			logger.info("Click on Edit Your Account Infomation");
			Thread.sleep(3000);
		     mai.edit_tele("5105551313");
		     logger.info("Edit Telephone number");
		     Thread.sleep(3000);
		     
		     logger.info("Finished TC_013_MyAccountInformation");
	 }
}