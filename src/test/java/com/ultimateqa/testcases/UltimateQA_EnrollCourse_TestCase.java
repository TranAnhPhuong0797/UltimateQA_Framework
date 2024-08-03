package com.ultimateqa.testcases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ultimateqa.data.UserData;

import common.BaseTest;
import pageObject.ultimateQA.PageGeneratorManager;
import reportConfig.ExtentTestManagerV5;

public class UltimateQA_EnrollCourse_TestCase extends BaseTest{	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserName(browserName);

		
		//Preconditions
		log.info("Preconditions - Step 01: Sign in user");
	}


	@Test
	public void Test_01(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Detail Product");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: ");

	}
	
	@Test
	public void Test_02(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Detail Product");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: ");

	}
	
	@Test
	public void Test_03(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Detail Product");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: ");

	}
	
	@Test
	public void Test_04_(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Detail Product");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: ");
	}
		
	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;

}
