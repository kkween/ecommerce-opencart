package testCases;

import org.testng.annotations.Test;

import pageObjects.AddressBook;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

  public class TC_015_AddressBook extends BaseClass
  {
  @Test
  public void test_Addressbook() throws InterruptedException 
  {
	  logger.info(" Starting TC_015_AddressBook");
	   
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
		
		
	    AddressBook ab=new AddressBook(driver);
		ab.address_book();
		logger.info("click on AddressBook");
		
		ab.newaddress_book();
		Thread.sleep(3000);
		logger.info("click on new AddressBook");
		
		ab.back_button();
		logger.info("Click on Back Button");
		Thread.sleep(3000);
		
		logger.info("Finished TC_015_AddressBook");
		
  }

}
