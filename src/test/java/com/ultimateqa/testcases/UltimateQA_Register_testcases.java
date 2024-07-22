package com.ultimateqa.testcases;

import java.lang.reflect.Method;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import common.BaseTest;
import common.GlobalConstants;
import pageObject.ultimateQA.PageGeneratorManager;
import pageObject.ultimateQA.PageObjectLogin;
import pageObject.ultimateQA.PageObjectRegister;
import reportConfig.ExtentTestManagerV5;

public class UltimateQA_Register_testcases extends BaseTest{
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserName(browserName, GlobalConstants.ULTIMATE_QA_PAGE_Login);
		pageLogin = PageGeneratorManager.getLoginPage(driver);
		
		
		log.info("Preconditions - Step 01: Navigate to Register Page");
		pageRegister = pageLogin.clickbyText("Create a new account");

	}
	
	@Test
	public void Test01_NotInputAnyvalue(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Register Page");
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 1 - Click button 'Sign-up'");
		pageRegister.clickbyText("Sign up");
		
		pageRegister.verifyErrorMessageVisible("First name can't be blank");
		
	}
	
	@Test
	public void Test02_Input_InvalidEMail(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Register Page");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 1 - Input FirstName");
		pageRegister.inputValueField("first_name", FirstName);
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 2 - Input LastName");
		pageRegister.inputValueField("last_name", LastName);
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 3 - Input Invalid Email");
		pageRegister.inputValueField("email", "czxczxc");
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 4 - Input Password");
		pageRegister.inputValueField("password", Password);
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 5 - Accept Terms of use");
		pageRegister.selectCheckbox("terms");
		
	}
	
	@Test
	public void Test03_Input_InvalidPassword(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Register Page");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 1 - ");
		
		
	}
	
	public void Test04_Input_ValidUser_Register_Success(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Register Page");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 1 - Input FirstName");
		pageRegister.inputValueField("first_name", FirstName);
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 2 - Input LastName");
		pageRegister.inputValueField("last_name", LastName);
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 3 - Input Email");
		pageRegister.inputValueField("email", Email);
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 4 - Input Password");
		pageRegister.inputValueField("password", Password);
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 5 - Accept Terms of use");
		pageRegister.selectCheckbox("terms");
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Step 6 - Click Button Sign-Up");
		pageRegister.clickbyText("Sign up");
	}
	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;


	private PageObjectRegister pageRegister;
	private PageObjectLogin pageLogin;
	private String FirstName = "TestUser";
	private String LastName = "num " + fakeNumber();
	private String Password = GlobalConstants.USERPASSWORD;
	private String Email = GlobalConstants.USER_NAME + fakeNumber() + "@gmail.com";
	public int fakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
}
