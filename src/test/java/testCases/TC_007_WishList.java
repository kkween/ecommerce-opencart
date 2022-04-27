package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WishList;
import testBase.BaseClass;

public class TC_007_WishList extends BaseClass
{
	
@Test
  public void test_wishlist() throws InterruptedException
  {
	  logger.info("Starting TC_007_WishList");
	try
	{
		
	
	  driver.get(rb.getString("appURL"));
	  HomePage hp=new HomePage(driver);
	   logger.info("Home Page Displayed ");
	
	   driver.manage().window().maximize();
	   
	   WishList wl=new WishList(driver);
	   
	   wl.search_txt("iMac");
	    Thread.sleep(2000);
	     logger.info("Enter any Product"); 
	
	    wl.search_button();
	    Thread.sleep(1000);
	    
	    wl.wlist_button();
	    Thread.sleep(3000);
	    
	    wl.wlist_icon();
	    Thread.sleep(5000);
	    
	    LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(rb.getString("email"));
		logger.info("Provided Email ");
		
		lp.setPassword(rb.getString("password"));
		logger.info("Provided Password ");
		
		lp.clickLogin();
		logger.info("Clicked on Login");
		
		

	    boolean tarpage=wl.isPageExists();
	    
	    if(tarpage)
	    {
	    	logger.info("WishList Failed ");
			Assert.assertTrue(false);
	    }
	    
	    else
		{
			logger.error("Search Success ");
			captureScreen(driver, "test_search"); //Capturing screenshot
			Assert.assertTrue(true);
		}
	}	
	catch(Exception e)
	{
		logger.fatal("WishList Failed ");
		Assert.fail();
	}
	
	logger.info(" Finished TC_007_WishList ");
	
}
     }
  