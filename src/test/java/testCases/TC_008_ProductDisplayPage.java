package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDisplayPage;
import testBase.BaseClass;

public class TC_008_ProductDisplayPage extends BaseClass
{
	
@Test
   public void test_productdisplay() throws InterruptedException 
   {
	  logger.info("Starting TC_008_ProductDisplayPage");
	  try
	 {
		  driver.get(rb.getString("appURL"));
		  HomePage hp=new HomePage(driver);
		   logger.info("Home Page Displayed ");
		
		   driver.manage().window().maximize();
		   
		  ProductDisplayPage pd=new ProductDisplayPage(driver);
		  
		  pd.search_txt("iMac");
		    Thread.sleep(2000);
		     logger.info("Enter any Product"); 
		
		    pd.search_button();
		    Thread.sleep(1000);
		    logger.info("click the search button");
		    
		    pd.pro_img();
		    Thread.sleep(1000);
		    logger.info("click the image");
		    
            pd.pro_duct();
            Thread.sleep(2000);
            logger.info("click the Product"); 
            
            pd.produreview();
            logger.info("click the Product Review"); 
            Thread.sleep(3000);
            
         /*  pd.productspec();
           logger.info("click the Product Specificartion");  */
           
            

    	    boolean tarpage=pd.isPageExists();
    	    
    	    if(tarpage)
    	    {
    	    	logger.info("ProductDisplayPage  success ");
       			Assert.assertTrue(true);
    	    }
    	    
    	    else
    		{
    			logger.error("ProductDisplayPage failed ");
    			captureScreen(driver, "test_search"); //Capturing screenshot
    			Assert.assertTrue(true);
    		}
    	}	
    	catch(Exception e)
    	{
    		logger.fatal("ProductDisplayPage  Failed ");
    		Assert.fail();
    	}
    	
    	logger.info(" Finished TC_008_ProductDisplayPage");
    	 
	  
}
   }

