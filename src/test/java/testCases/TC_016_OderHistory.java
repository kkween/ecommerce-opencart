package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderHistory;
import testBase.BaseClass;

public class TC_016_OderHistory extends BaseClass
{
  @Test
  public void test_OrderHistory() throws InterruptedException
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
		
		OrderHistory oh=new OrderHistory(driver);
		oh.order_history();
		logger.info("Clicked on Order History");
		Thread.sleep(3000);
		
		logger.info("Finished TC_016_OrderHistory");
  }
}
