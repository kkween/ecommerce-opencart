package testCases;

import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_009_ForgotPassword extends BaseClass
{
@Test
public void test_forgotpassword() throws InterruptedException
{
	logger.info("Starting TC_009_ForgotPassword");
	
	driver.get(rb.getString("appURL"));
	  HomePage hp=new HomePage(driver);
	   logger.info("Home Page Displayed ");
	
	   driver.manage().window().maximize();
	   
	  
		hp.clickMyAccount();
		logger.info("Clicked on My Account ");
		hp.clickLogin();
		logger.info("Clicked on Login ");
				  
	   ForgotPassword fp=new ForgotPassword(driver);
	  	fp.setEmail(rb.getString("email"));
		logger.info("Provided Email ");
		
	   
	   fp.forgotpwd();
	   Thread.sleep(3000);
	   fp.femail("srivenfamily@gmail.com");
	   logger.info("Provided confirmation email");
	   Thread.sleep(2000);
	   
	   fp.continuebutton();
	   logger.info("Finished TC_009_ForgotPassword");
	   Thread.sleep(3000);
	   
}
}
