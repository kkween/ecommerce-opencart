package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductCompare;
import testBase.BaseClass;

@Test
public class TC_006_ProductCompare extends BaseClass
{
	
public void test_productcompare () throws InterruptedException 
{
	logger.info("Strating TC_006_ProductCompare");
	
	 driver.get(rb.getString("appURL"));
	 HomePage hp=  new HomePage(driver);
	 logger.info("Home Page Displayed ");
	 
	 driver.manage().window().maximize();
	 
	 ProductCompare pc = new ProductCompare(driver);
	 pc.search_txt("iMac");
	 

	  Thread.sleep(3000);
		logger.info("Enter any Product"); 
		
		pc.search_button();
		Thread.sleep(3000);
		logger.info("product displayed on HomePage");
		
		
		pc.product_compare();
		Thread.sleep(3000);
		logger.info("products comparing");
		
		pc.productcopareicon();
		Thread.sleep(3000);
		
	
}
}

