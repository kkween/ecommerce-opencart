package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class TC_010_ShoppingCart  extends BaseClass
{
@Test
   public void test_ShoppingCart() throws InterruptedException
    {
	   logger.info("Starting TC_010_ShoppingCart");
	   driver.get(rb.getString("appURL"));
	   HomePage hp=new HomePage(driver);
	   logger.info("Home Page Displayed ");
	
	   driver.manage().window().maximize();
	   
	   ShoppingCart sc=new ShoppingCart(driver);
	   sc.searchtxt("iMac");
	   logger.info("Search iMac is  Displayed ");
	   
	   sc.searchbutton();
	   logger.info("Search Button clicked ");
	   Thread.sleep(3000);
	 
	   sc.addtocart();
	   logger.info("Add to Cart clicked ");
	   Thread.sleep(5000);
	 
		
	  sc.shop_cart();
	  logger.info("Shopping Cart clicked ");
	  Thread.sleep(5000);
		 
	  sc.dropdown();
	  logger.info("Use Coupon Code Clicked");
	  Thread.sleep(2000);
	  
	  sc.drptext("EKm209");
	  logger.info("Entered Use Coupon Code ");
	    
	  sc.drpdown2();
	  logger.info("Estimated Shipping and Taxes clicked");
	  Thread.sleep(1000);
	  sc.select_list();
	  logger.info("Selected Country");
	  Thread.sleep(3000);
	  
	  sc.select_list2();
	  logger.info("Selected State");
	  Thread.sleep(1000);
	  
	  sc.select_text("85383");
	  logger.info("Selected PostCode");
	  Thread.sleep(1000);
	  sc.select_getquote();
	  logger.info("Get Quotes button clicked");
	  sc.select_radio();
	  logger.info("Selected Radio button");
	  Thread.sleep(1000);
	  sc.select_applyship();
	  logger.info("Clicked Apply Shippiment");
	  Thread.sleep(5000);
	  
	  sc.select_gift();
	  logger.info("Selected Use Gift Certificate");
	  sc.select_giftcertifi("X2D4B44");
	  logger.info("Entered Gift certificate cade entered in the text box");
	  Thread.sleep(1000);
	  sc.select_buttongc();
	  logger.info("clicked Entered Apply Gift Certificate");
	  Thread.sleep(1000);
	  
	  sc.click_continue();
	  logger.info("click on Continue Shopping");
	  Thread.sleep(3000); 
	  
}
}
