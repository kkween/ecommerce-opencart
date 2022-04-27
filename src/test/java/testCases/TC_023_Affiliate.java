package testCases;

import org.testng.annotations.Test;

import pageObjects.Affiliate;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_023_Affiliate extends BaseClass
{
	@Test
	public void test_Newletter() throws InterruptedException
	{
			logger.info(" Starting TC_023_Affiliate");
			   
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
				Affiliate af =new Affiliate(driver);
				af.edit_affiliate();
				logger.info("Click Edit your affilicate information");
				af.companyname("ABCDEF");
				logger.info("Enter Company Name");
				af.websitename("www.xyz.com");
				logger.info("Enter WebSite Name");
				af.taxx("988731");
				logger.info("Enter tax");
				af.paymentmethod();
				logger.info("Select Payment Mehtod");
				af.payeename("kween");
				logger.info("Enter Cheque Payee Name");
				Thread.sleep(5000);
				af.contbutton();
				Thread.sleep(2000);
				logger.info("Finishe TC_023_Affiliate");
				

}
}