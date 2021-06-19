package com.test.classes;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pom.classes.LoginPage;

import Utility.Testdata;
import testBrowserSetup.Base;



public class VerifyLoginpage extends Base {
	
	private WebDriver driver;
	private LoginPage log;
	private SoftAssert soft;
	private Workbook a;
	
	int testid;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	
	
	@BeforeSuite
	public void openWorkbook() throws EncryptedDocumentException, IOException
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		a = Testdata.OpenWorkbook();
	}
	@BeforeTest
	@Parameters("browser")
	
	public void launch(String browser) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			
			driver =openChromeBrowser();
			
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver =openEdgeBrowser();
		}
		
	}
	
	@BeforeMethod
	public void openApp()
	{
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	

	@Test
	public void checksignin() throws InterruptedException
	{
		log = new LoginPage(driver);
		soft= new SoftAssert();
		System.out.println(driver.getCurrentUrl());
		//Assert.assertTrue(log.checkPageTitle());
		System.out.println(log.checkPageTitle());
		
		//log.SendUserID("1234");
		//System.out.println(Testdata.fetchData(a, "Sheet1", 1, 0));
		

		log.SendUserID("abcd");
		log.SendPassword("1234");
		
//		log.SendUserID(Testdata.fetchData(a, "Sheet1", 1, 0));
//		log.SendPassword(Testdata.fetchData(a, "Sheet1", 1, 1));
		log.ClickonLogin();
		
	}
	
	@AfterMethod
	public void quite () {driver.close();}
//	@AfterTest
//	public void close(ITestResult result)
//	{
////		if(ITestResult.FAILURE == result.getStatus())
////		{
////			//screenshot method
////		}
//		driver.quit();
//	}

}
