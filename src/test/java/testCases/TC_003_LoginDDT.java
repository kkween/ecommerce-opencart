package testCases;


	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import pageObjects.HomePage;
	import pageObjects.LoginPage;
	import pageObjects.MyAccountPage;
	import testBase.BaseClass;
	import utilities.XLUtility;

	public class TC_003_LoginDDT extends BaseClass{
		
		
		@Test(dataProvider="LoginData")
		public void test_LoginDDT(String email,String pwd,String exp)
		{
			logger.info(" Starting TC_003_LoginDDT ");
			
			try
			{
				driver.get(rb.getString("appURL"));
				logger.info("Home Page Displayed ");
				
				driver.manage().window().maximize();
				
				HomePage hp=new HomePage(driver);
				hp.clickMyAccount();
				logger.info("Clicked on My Account ");
				hp.clickLogin();
				logger.info("Clicked on Login ");
				
				LoginPage lp=new LoginPage(driver);
				
				lp.setEmail(email);
				logger.info("Provided Email ");
				
				lp.setPassword(pwd);
				logger.info("Provided Password ");
				
				lp.clickLogin();
				logger.info("Clicked on Login");
				
				
				boolean targetpage=lp.isMyAccountPageExists();//this method is created in LoginPage
				
				if(exp.equals("Valid"))
				{
					if(targetpage==true)
					{
						logger.info("Login Success ");
						
						MyAccountPage myaccpage=new MyAccountPage(driver);
						myaccpage.clickLogout();
						Assert.assertTrue(true);
					}
					else
					{
						logger.error("Login Failed ");
						Assert.assertTrue(false);
					}
				}
				
				if(exp.equals("Invalid"))
				{
					if(targetpage==true)
					{
						MyAccountPage myaccpage=new MyAccountPage(driver);
						myaccpage.clickLogout();
						Assert.assertTrue(false);
					}
					else
					{		
						logger.error("Login Failed ");
						Assert.assertTrue(true);
					}
				}
				
				
			}catch(Exception e)
			{
				logger.fatal("Login Failed ");
				Assert.fail();
			}
			
			logger.info(" Finished TC_003_LoginDDT ");
			
		}
		
		
		@DataProvider(name="LoginData")
		public String [][] getData() throws IOException
		{
			String path=".\\testData\\Opencart_LoginData.xlsx";//taking xl file from testData
			
			XLUtility xlutil=new XLUtility(path);//creating an object for xlutils
			
			int totalrows=xlutil.getRowCount("Sheet1");	
			int totalcols=xlutil.getCellCount("Sheet1",1);
					
			String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
			
			for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
			{		
				for(int j=0;j<totalcols;j++)  //0    i is rows j is col
				{
					logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
				}
			}
		return logindata;//returning two deminsion array
					
		}
		
		
		
	
	

}
