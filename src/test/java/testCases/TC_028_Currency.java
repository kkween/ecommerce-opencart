package testCases;


import org.testng.annotations.Test;

import pageObjects.Currency;
import pageObjects.HomePage;
import testBase.BaseClass;

@Test
public class TC_028_Currency extends BaseClass
{

		public void  test_currency() throws InterruptedException
		{
		logger.info(" Starting TC_027_GiftCerticate");
		driver.get(rb.getString("appURL"));
		   HomePage hp=new HomePage(driver);
		   logger.info("Home Page Displayed ");
		
		   driver.manage().window().maximize();
		    Currency cy= new Currency(driver);
		    
		    cy.currencylink();
		    logger.info("Clcik on currency");
		    Thread.sleep(3000);
		    cy.USdollar();
		    logger.info("Clcik on US Dollar");
		    Thread.sleep(5000);
		    logger.info("Finsihed TC_028_Currency");

}
}