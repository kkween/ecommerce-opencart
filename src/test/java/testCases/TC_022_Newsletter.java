package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Newsletter;
import pageObjects.RecurringPayment;
import testBase.BaseClass;

public class TC_022_Newsletter extends BaseClass
{
	@Test
	public void test_Newletter() throws InterruptedException
	{
			logger.info(" Starting TC_022_NewsLetter");
			   
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
				
			Newsletter nl =new Newsletter(driver);
						nl.News_Letter();
						Thread.sleep(3000);
				logger.info("Clicked on NewsLetter");
				
				nl.radio_button();
				Thread.sleep(3000);
				logger.info("Clicked on NewsLetter radio button");
				
				nl.continbutton();
				Thread.sleep(3000);
				logger.info("Clicked on Contionue Button");
				
				
				logger.info("Finished TC_022_News Letter");
}
}