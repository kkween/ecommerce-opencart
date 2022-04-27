package testCases;

import org.testng.annotations.Test;

import pageObjects.ChangePassword;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_014_ChangePassword extends BaseClass
{
  @Test
  public void test_changepassword() throws InterruptedException
  {
	  logger.info(" Starting TC_013_MyAccountInformation ");
	   
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
		
		ChangePassword cp= new ChangePassword(driver);
		cp.change_pwd();
		Thread.sleep(3000);
		//cp.before_pwd("project1234");
		
		//cp.pwd_confm("project1234");
		Thread.sleep(3000);
		cp.back_homepage();
		logger.info("Home Page Displayed");
		//cp.continbutton();
		Thread.sleep(3000);
		
  }
}
