package testCases;

import org.testng.annotations.Test;

import pageObjects.Downloads;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_017_Downloads extends BaseClass
{
	@Test
  public void test_downloads() throws InterruptedException
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
		
		Downloads down=new Downloads(driver);
		down.site_map();
		logger.info("Clicked on Site Map");
		
		down.down_load();
		logger.info("Clicked on Download");
		Thread.sleep(3000);
		logger.info("Finished TC_017_Downloads");
		
  }
}
