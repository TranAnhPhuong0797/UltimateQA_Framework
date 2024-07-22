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
import com.nopcommerce.data.UserData;

import common.BaseTest;
import common.GlobalConstants;
import pageObject.ultimateQA.PageGeneratorManager;
import pageObject.ultimateQA.PageObjectLogin;
import reportConfig.ExtentTestManagerV5;

public class UltimateQA_Login_TestCase extends BaseTest{
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserName(browserName, GlobalConstants.ULTIMATE_QA_PAGE_Login);
		pageLogin = PageGeneratorManager.getLoginPage(driver);
		String validEmail = UserData.Login.UserEmail;
		String validPassword = UserData.Login.UserPASSWORD;

		log.info("Preconditions - Step 01: Navigate to Register Page");
		
	}

	@Test
	public void Login_01_Login_With_EmptyData(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Login With EmptyData");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 01: Click Login Button");
		pageLogin.clickbyText("Sign in");
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 02: Verify email error message");
		Assert.assertEquals(pageLogin.getErrorMessageAtEmailTextbox(), "Invalid email or password.");
	}
	
	@Test
	public void Login_02_Login_With_InvalidEmail(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Login With InvalidEmail");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 01: Input Invalid Email");
		pageLogin.inputValueField("email", "czxczxc");
		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 02: Input Password");
		pageLogin.inputValueField("password", Password);
			
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 04: Verify email error message");
		Assert.assertEquals(pageLogin.getErrorMessageAtEmailTextbox(), "Please enter a valid email address");
	}
	
	@Test
	public void Login_03_Login_With_Email_Not_Register(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Login With Email Not Register");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 01: Input Invalid Email");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 02: Input Password");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 03: Click Login Button");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 04: Verify login unsuccessful message");
		
	}
	
	@Test
	public void Login_04_Login_With_Email_Register_Password_Empty(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Login With Email Register Password Empty");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 01: Input Email");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 02: Input empty Password");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 03: Click Login Button");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 04: Verify login unsuccessful message");
		
	}
	
	@Test
	public void Login_05_Login_With_Email_Register_Password_Invalid(Method method) {
		ExtentTestManagerV5.startTest(method.getName(), "Login With Email Register Password Invalid");
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 01: Input Email");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 02: Input incorrect Password");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 03: Click Login Button");

		
		ExtentTestManagerV5.getTest().log(Status.INFO, "Login - Step 04: Verify login unsuccessful message");
	
	}
	
	
	public int fakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	private String Password = GlobalConstants.USERPASSWORD;
	private String Email = GlobalConstants.USER_NAME + "@gmail.com";

	private PageObjectLogin pageLogin;
}
