package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Addcart;
import pageObjects.HomePage;
import testBase.BaseClass;

@Test
public class TC_005_Addcart extends BaseClass

{
	public void  test_addcart() throws InterruptedException
	{
	 logger.info("Starting TC_005_Addcart");
	 try
	 {
	 driver.get(rb.getString("appURL"));
	 HomePage hp=  new HomePage(driver);
	 logger.info("Home Page Displayed ");
	 
	 driver.manage().window().maximize();
		
	 Addcart ac=new Addcart(driver);
	  ac.search_txt("iMac");
	  
	  Thread.sleep(3000);
		logger.info("Enter any Product"); 
		
		ac.search_button();
		Thread.sleep(3000);
		logger.info("product displayed on HomePage");
		
		ac.addcart();
		logger.info("product added to cart");
		Thread.sleep(2000);//
		ac.viewcart();
		Thread.sleep(3000);
		logger.info("product added to viewcart");
		
		ac.view();
		Thread.sleep(3000);
		logger.info("product added to view");
		
		 String confmg=ac.getConfirmationMsg();//
		   
		    if(confmg.equals("Success: You have added iMac to your shopping cart!"))
	        	
	 		{
	        	 logger.info("Search page is Success ");
	 			  Assert.assertTrue(true);
	 		}
	 		else
	 		{
	 			logger.error("Add cart  Page Failed ");
				captureScreen(driver, "test_search"); 
				
				Assert.assertTrue(false);
	 			
	 		}
	    	}
	    	catch(Exception e)
	    	{
	    	logger.fatal("Add cart  Failed");
	    	Assert.fail();
	    	
	    	}
	    	logger.info("Finished TC_005_Addcart");
	}
}