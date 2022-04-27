package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

@Test
public class TC_011_Checkout extends BaseClass
{
	
	public void test_checkout() throws InterruptedException
	{
		logger.info(" Starting TC_004_Search ");
		try
		{
		driver.get(rb.getString("appURL"));
		   HomePage hp=new HomePage(driver);
		   logger.info("Home Page Displayed ");
		
		   driver.manage().window().maximize();
		
		    Checkout co=new Checkout(driver);
			
		   co.searchtxt("iMac");
		   Thread.sleep(2000);
		     logger.info("Enter any Product"); 
		
		    co.searchbutton();
		    logger.info("click on the search button"); 
		    Thread.sleep(1000);
		    
		    co.addcart();
		    logger.info("click on the add to cart button"); 
		    Thread.sleep(1000);
		    
		    co.viewcart();
		    logger.info("click on the view cart"); 
		    Thread.sleep(3000);
		    co.shop_cart();
		    logger.info("click on the shopping cart"); 
		    Thread.sleep(3000);
		    
		    co.check_out();
		    logger.info("click on the Checkout"); 
		    Thread.sleep(1000);
		    
 boolean targetpage=co.isPageExists();
		    
		    if(targetpage)
		    {
		    	logger.info("Checkout Failed ");
		    	captureScreen(driver, "test_checkout");
				Assert.assertTrue(false);
		    }
		    
		    else
			{
				logger.error("Checkout Success ");
				
				Assert.assertTrue(true);
			}
		}	
		catch(Exception e)
		{
			logger.fatal("Checkout Failed ");
			Assert.fail();
		}
		
		logger.info(" Finished TC_011_Checkout ");
		
	}
	     }
		
      
             