package test;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import utility.Reports;
import utility.Screenshot;

public class Listeners1 extends BaseTest implements ITestListener{

	
	public void onStart(ITestContext result) {
		
		reports = Reports.configureReports();

	}
	
	public void onFinish(ITestContext result) {
		reports.flush();

	}
	
	public void onTestStart(ITestResult result) {
	//	System.out.println("Test Started"+ result.getName());
		
		test1.log(Status.PASS,result.getName());//extent

		}
	
	public void onTestSuccess(ITestResult result) {
	//	System.out.println("Test Passed"+ result.getName());
		
		test1.log(Status.PASS,result.getName());//extent

		}
	
	public void onTestFailure(ITestResult result) {
	//	System.out.println("Test Failed"+ result.getName());
		
		test1.log(Status.FAIL,result.getName());

/*	try {
		Screenshot.takeScreenshot(driver, result.getName());
	}
		catch(IOException e)
	{
		e.printStackTrace();	
	}	*/	
	}
		
	
	public void onTestSkipped(ITestResult result) {
	//	System.out.println("Test Skipped"+ result.getName());

		test1.log(Status.SKIP, result.getName());

		
	}


}
