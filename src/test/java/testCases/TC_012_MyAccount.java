package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_012_MyAccount extends BaseClass
  {
   @Test
   public void test_Myaccount() throws InterruptedException
   {
	   logger.info(" Starting TC_012_MyAccount ");
	   
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
		
		MyAccount ma=new MyAccount(driver);
		hp.clickMyAccount();
		logger.info("Click on MyAccount");
		ma.order_history();
		logger.info("Click on OrderHistory ");

		Thread.sleep(3000);
		hp.clickMyAccount();
		logger.info("Click on MyAccount");
				
		ma.clickLogout();
		Thread.sleep(3000);
		logger.info("Click on LogOut");
		
		ma.site_map();
		logger.info("Click on SiteMap Link");
		Thread.sleep(3000);
		
		 logger.info("Finished TC_012_MyAccount");
}
}
