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
import common.GlobalConstants;
import reportConfig.ExtentTestManagerV5;

public class UltimateQA_Search_TestCase extends BaseTest{
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserName(browserName, GlobalConstants.ULTIMATE_QA_PAGE_URL);
		
		
		//Preconditions
		log.info("Preconditions - Step 01: Select 'Free Courses' in Footer");
		
		
	}

	@Test
	public void Test_01_Input_Invalid_Product(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Product Page");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Product Page - Step 01: Input invalid product");
		
	}
	
	@Test
	public void Test_02_Input_Valid_Product(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Sort from Z to A");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Categories Page - Step 01: Input valid product");
		
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	private WebDriver driver;
}
