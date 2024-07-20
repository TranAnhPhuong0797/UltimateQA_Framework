package com.ultimateqa.testcases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import common.BaseTest;
import pageObject.ultimateQA.PageGeneratorManager;
import pageObject.ultimateQA.PageObjectUltimateQAautomation;
import reportConfig.ExtentTestManagerV5;

public class FirstTest_UltimateQA extends BaseTest{
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserName(browserName);
		pageUltimateQAAutomation = PageGeneratorManager.getultimateQAautomation(driver);
	}
	
	@Test
	public void Test01_VerifyHeader(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Add to Wishlist");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 1 - Verify Hearder");
		pageUltimateQAAutomation.verifyHeaderVisible("Services");
		
	}
	
	@Test
	public void Test02_VerifyFooter(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Add Product to Card");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 1 - Verify Footer");
		pageUltimateQAAutomation.verifyFooterVisible("Java SDET Academy");
		
		
	}
	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;


	private PageObjectUltimateQAautomation pageUltimateQAAutomation;
}
