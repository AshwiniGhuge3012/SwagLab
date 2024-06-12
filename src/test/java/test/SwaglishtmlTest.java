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




@Listeners (test.Listeners1.class)

public class SwaglishtmlTest extends BaseTest {

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
		//Thread.sleep(2000);
		test1=reports.createTest("standard_user");
		
		SwagLabLoginPage swagLabLoginPage =new SwagLabLoginPage(driver);
		
		//Thread.sleep(2000);
		
		String name = Parametrization.getExcelData(0, 0);
		String pass = Parametrization.getExcelData(1, 1);
		
		swagLabLoginPage.enterUsername(name);
		
		swagLabLoginPage.enterPassword(pass);
		
		swagLabLoginPage.clickOnLoginButton();
		//Thread.sleep(2000);
	//	Assert.assertTrue(false);
	}
	
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

