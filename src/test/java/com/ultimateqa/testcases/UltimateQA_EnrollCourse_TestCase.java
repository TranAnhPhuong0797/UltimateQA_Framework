package com.ultimateqa.testcases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.nopcommerce.data.UserData;

import common.BaseTest;
import pageObject.ultimateQA.PageGeneratorManager;
import reportConfig.ExtentTestManagerV5;

public class UltimateQA_EnrollCourse_TestCase extends BaseTest{	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserName(browserName);

		
		//Preconditions
		log.info("Preconditions - Step 01: Navigate to Register Page");
	}


	@Test
	public void Searh_01_Search_With_Empty_Data(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Search with empty data");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: Navigate to Search page");

	}
	
	@Test
	public void Searh_02_Search_With_Data_NOT_Exist(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Search with data not exist");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: Input product not exist in the search field");

	}
	
	@Test
	public void Searh_03_Search_With_Product_Name_Relative(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Search with product name relative");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: Input product not exist in the search field");

	}
	
	@Test
	public void Searh_04_Search_With_Product_Name_Adsolute(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Search with product name adsolute");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: Input product not exist in the search field");
	}
		
	
	@Test
	public void Searh_05_Advanced_Search_With_Paren_Categories(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Search with paren category");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: Input value in Search textbox");

	}
	
	@Test
	public void Searh_06_Advanced_Search_With_SubCategories(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Search with sub categories");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Search Page - Step 01: Input value in Search textbox");

	}
	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;

}
