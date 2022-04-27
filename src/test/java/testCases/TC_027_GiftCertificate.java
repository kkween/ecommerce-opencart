package testCases;

import org.testng.annotations.Test;

import pageObjects.GiftCertificate;
import pageObjects.HomePage;
import testBase.BaseClass;
@Test
public class TC_027_GiftCertificate extends BaseClass
{

		public void  test_HeaderFooterMenuOptions() throws InterruptedException
		{
		logger.info(" Starting TC_027_GiftCerticate");
		driver.get(rb.getString("appURL"));
		   HomePage hp=new HomePage(driver);
		   logger.info("Home Page Displayed ");
		
		   driver.manage().window().maximize();
		    
		GiftCertificate gc=new GiftCertificate(driver);
		
		   
		gc.gift();
		logger.info("Click on footer option: Gift Certicate link");
		Thread.sleep(2000);
		gc.recname("XYZ");
		logger.info("Enter the Recipient's Name");
		
		gc.email("lizette@gmail.com");
		logger.info("Enter the Recipient's email");		
		
		gc.yourname("kween");
		logger.info("Enter the Your Name");
		Thread.sleep(2000);	
		gc.youremail("xyz@yahoo.com");
		logger.info("Enter the Your Email");
		
		gc.radiobutton();
		logger.info("click on Christmas Radio Button");
		gc.message("Gift Card:");
		logger.info("click on Message");
		Thread.sleep(2000);
		gc.ramount("2");
		logger.info("click on Amount");
		Thread.sleep(2000);
		gc.chkagree();
		logger.info("click on Agree Check Box");
		Thread.sleep(2000);
		gc.continuebutton();
		logger.info("click on Continue Button");
		Thread.sleep(2000);
		logger.info("Finished TC_027_GiftCertificate");
}
}