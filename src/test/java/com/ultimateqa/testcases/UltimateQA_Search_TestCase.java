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
import reportConfig.ExtentTestManagerV5;

public class UltimateQA_Search_TestCase extends BaseTest{
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserName(browserName);
		
		
		//Preconditions
		log.info("Preconditions - Step 01: Select menu computers");
		
		
		log.info("Preconditions - Step 02: Select category Notebooks");
		
	}

	@Test
	public void Sort_01_Sort_With_Name_AtoZ_Asc(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Sort from A to Z");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Categories Page - Step 01: Select sorting categories Name A to Z");
		
	}
	
	@Test
	public void Sort_02_Sort_With_Name_ZtoA_Desc(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Sort from Z to A");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Categories Page - Step 01: Select sorting categories Name Z to A");
		
	}
	
	@Test
	public void Sort_03_Sort_With_Price_LowToHigh(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Sort from Low to High");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Categories Page - Step 01: Select sorting categories Price Low to High");
	
	}
	
	@Test
	public void Sort_04_Sort_With_Price_HighToLow(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Sort from High to Low");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Categories Page - Step 01: Select sorting categories Price High to Low");

	}
	
	@Test
	public void Sort_05_Displayed_3_Products_per_page(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Verify the number of products");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Categories Page - Step 01: Select dropdown list Display");

	}
	
	@Test
	public void Sort_06_6_Products_per_page(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Verify the number of products");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Categories Page - Step 01: Select dropdown list Display");

	}
	
	@Test
	public void Sort_07_9_Products_per_page(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Verify the number of products");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Categories Page - Step 01: Select dropdown list Display");

	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	private WebDriver driver;
}
