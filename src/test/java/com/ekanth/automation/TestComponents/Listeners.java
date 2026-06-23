package com.ekanth.automation.TestComponents;

import java.io.IOException;
import java.lang.reflect.Field;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ekanth.automation.properties.ExtendReporterNG;

public class Listeners extends BaseTest implements ITestListener {
	
	ExtentReports extent = ExtendReporterNG.getReportObject();
	
	ThreadLocal<ExtentTest> extendTest = new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		
		extendTest.set(extent.createTest(result.getMethod().getMethodName())); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		
		extendTest.get().log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		if(extendTest.get() !=null) {
		extendTest.get().fail(result.getThrowable());//get the error message 
		}
		
		try {

			Field field = result.getInstance()
		            .getClass()
		            .getSuperclass()
		            .getDeclaredField("driver");

		    field.setAccessible(true);

		    driver = (WebDriver) field.get(result.getInstance());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//take screenshot and attach with the report 
		
	    if (driver == null) {

	        System.out.println("Driver is null — screenshot skipped");

	        return;
	    }
		
		String filePath=null;
		
		try {
			filePath = getScreenshot(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (filePath != null) {

		    extendTest.get().addScreenCaptureFromPath(
		            filePath,
		            result.getMethod().getMethodName());

		}
		else {

		    System.out.println("Screenshot not added — filePath is null");

		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		
		extent.flush();
	}
	
	
	

}
