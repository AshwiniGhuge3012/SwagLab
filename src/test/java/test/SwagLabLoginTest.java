package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import pojo.Browser;
import pom.SwagLabHomePage;
import pom.SwagLabLoginPage;
import utility.Parametrization;
import utility.Reports;
import utility.Screenshot;



@Listeners (test.Listeners1.class)

public class SwagLabLoginTest extends BaseTest {

@BeforeTest

public void configureReporting() {
	reports = Reports.configureReports();
}

	@BeforeMethod
	public void openSwagLab() {
	 driver = Browser.Launch("https://www.saucedemo.com/");
	}
	
	@Test
	public void loginWithValidUser() throws InterruptedException, EncryptedDocumentException, IOException {
	//	Thread.sleep(2000);
		test1=reports.createTest("standard_user");
		SwagLabLoginPage swagLabLoginPage =new SwagLabLoginPage(driver);
		//Thread.sleep(2000);
		String name = Parametrization.getExcelData(0, 0);
		String pass = Parametrization.getExcelData(1, 1);
		
		swagLabLoginPage.enterUsername(name);
	//	Thread.sleep(2000);
		swagLabLoginPage.enterPassword(pass);
	//	Thread.sleep(2000);
		swagLabLoginPage.clickOnLoginButton();
	//	Thread.sleep(2000);
	/*	SwagLabHomePage swagLabHomePage = new SwagLabHomePage(driver);
		  swagLabHomePage.clickonmenu();//if this line not execution then assertion not execute and it will stop further execution so hello doesn't print after that.
		  
		  //It takes time to display logout after click on menu , test bacome fail due to this
		  // so we have to add thread
		  
		  Thread.sleep(2000);
		  
		Assert.assertTrue(swagLabHomePage.isLogoutDisplayed());
		Assert.assertEquals(swagLabHomePage.getInventoryCount(), 8);//expected 8 but actual 6...so assertion fail.so hello will not print due to hard assertion
		
		System.out.println("Hello");*/
		
		Assert.assertTrue(false);
	}
	
		@Test
		public void loginWithLockedOutUser () throws IOException, InterruptedException {
			Thread.sleep(2000);
			
			test1=reports.createTest("loginWithLockedOutUser");

			SwagLabLoginPage swagLabLoginPage =new SwagLabLoginPage(driver);
		
			String name = Parametrization.getExcelData(1, 0);
			String pass = Parametrization.getExcelData(1, 1);
			
			
	    	swagLabLoginPage.enterUsername(name);
	    	swagLabLoginPage.enterPassword(pass);
	    	swagLabLoginPage.clickOnLoginButton();
	    	
	   	Assert.assertTrue(false);
	    	
	/*    	 Thread.sleep(2000);
	    	
			SwagLabHomePage swagLabHomePage = new SwagLabHomePage(driver);
			swagLabHomePage.clickonmenu();
	    	
	    	Thread.sleep(2000);
	    	SoftAssert softassert  = new SoftAssert();
	    	
	    	softassert.assertTrue(swagLabHomePage.isLogoutDisplayed());//this assertion is fail even after that remaining code execute
	    	System.out.println("Soft Assertion Completed");
	    	
	    	softassert.assertEquals(swagLabHomePage.getInventoryCount(), 6);
	    	System.out.println("Hello");
	    	
	    	softassert.assertAll();
	    	
		Screenshot.takeScreenshot(driver, "ss1");*/
		}			
				
		@Test
		public void loginWithProblemUser() throws InterruptedException, EncryptedDocumentException, IOException{
			Thread.sleep(2000);
		
			test1 = reports.createTest("loginWithProblemUser");
			SwagLabLoginPage swagLabLoginPage =new SwagLabLoginPage(driver);
			
			String name = Parametrization.getExcelData(2, 0);
			String pass = Parametrization.getExcelData(1, 1);
			
			
	    	swagLabLoginPage.enterUsername(name);
	    	swagLabLoginPage.enterPassword(pass);
	    	swagLabLoginPage.clickOnLoginButton();
	    	
	/*   	 Thread.sleep(2000);
	    	
			SwagLabHomePage swagLabHomePage = new SwagLabHomePage(driver);
			swagLabHomePage.clickonmenu();
	    	
	    	Thread.sleep(2000);
	    	SoftAssert softassert  = new SoftAssert();
	    	
	    	softassert.assertTrue(swagLabHomePage.isLogoutDisplayed());//this assertion is fail even after that remaining code execute
	    	System.out.println("Soft Assertion Completed");
	    	
	    	softassert.assertEquals(swagLabHomePage.getInventoryCount(), 6);
	    	System.out.println("Hello");
	    	
	    	softassert.assertAll();*/ 
	    	
	  	}
						
				
		@Test
		public void loginWithPerformanceGlitchUser() throws InterruptedException, EncryptedDocumentException, IOException {
			Thread.sleep(2000);
			
			test1 = reports.createTest("loginWithPerformanceGlitchUser");
			SwagLabLoginPage swagLabLoginPage =new SwagLabLoginPage(driver);
			
			String name = Parametrization.getExcelData(3, 0);
			String pass = Parametrization.getExcelData(1, 1);
			
		swagLabLoginPage.enterUsername(name);
		swagLabLoginPage.enterPassword(pass);
		swagLabLoginPage.clickOnLoginButton();
		}
		


	/*	@AfterMethod
		public void closeSwagLab () {
			driver.close();*/
		
	/*	@AfterMethod    // at tHe time of extent report
		public void addReportStatus(ITestResult result) {
			
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				test1.log(Status.PASS,result.getName());
		}		
			else if(result.getStatus()==ITestResult.FAILURE)	
			{
				test1.log(Status.FAIL, result.getName());
				
			}
			else
			{
				test1.log(Status.SKIP, result.getName());
			}
}		
		
		@AfterTest
		public void publishReport() {
			reports.flush();
		}*/
}			
			
				

