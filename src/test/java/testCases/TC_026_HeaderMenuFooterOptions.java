package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderFooterMenuOptions;
import pageObjects.HomePage;
import testBase.BaseClass;

@Test
public class TC_026_HeaderMenuFooterOptions  extends BaseClass
{
	public void  test_HeaderFooterMenuOptions() throws InterruptedException
	{
	logger.info(" Starting TC_026_HeaderMenuFooterOptions");
	driver.get(rb.getString("appURL"));
	   HomePage hp=new HomePage(driver);
	   logger.info("Home Page Displayed ");
	
	   driver.manage().window().maximize();
	   
	   HeaderFooterMenuOptions hmfo=new HeaderFooterMenuOptions(driver);
	   
	hmfo.brand();
	logger.info("Click on footer option: Brands link");
	Thread.sleep(2000);
	hmfo.cannonlink();
	logger.info("Click on Product Cannon");
	Thread.sleep(2000);
	hmfo.grid();
	logger.info("Click on Product on Grid format");
	Thread.sleep(2000);
	hmfo.productcompare();
	logger.info("Click on Product Compare");
	Thread.sleep(2000);
	
	
	logger.info("Finished TC_026_HeaderMenuFooterOptions");
}
}