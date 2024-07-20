package pageObject.ultimateQA;


import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUI.ultimateQA.HomePageUI;

public class UserHomePageObject extends BasePage{
	private WebDriver driver;
	
	public UserHomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public UserRegisterPageObject clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		// 2
		//return new RegisterPageObject(driver);
		
		// 3
		return PageGeneratorManager.getUserRegistorPage(driver);
	}

	public UserLoginPageObject openLoginPage() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);		
		return PageGeneratorManager.getUserLoginPage(driver);
	}
	
	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(driver, HomePageUI.MYACCOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MYACCOUNT_LINK);
	}

	public UserCustomerInforPageObject clickToMyAccountLink() {
		waitForElementClickable(driver, HomePageUI.MYACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MYACCOUNT_LINK);
		return PageGeneratorManager.getUserCustomerInforPage(driver);
	}
	
	public void backToHomePage() {
		waitForElementClickable(driver, HomePageUI.LOGO_HOME);
		clickToElement(driver, HomePageUI.LOGO_HOME);		
	}

	public UserCategoriesPageObject selectHeaderMenu(String menu) {
		waitForElementClickable(driver, HomePageUI.HEADER_MENU, menu);
		clickToElement(driver, HomePageUI.HEADER_MENU, menu);
		return PageGeneratorManager.getUserCategoriesPage(driver);
	}

	public UserCompareProductPageObject clickCustomerServiceLinkInFooter(String link) {
		waitForElementClickable(driver, HomePageUI.FOOTER_MENU_CUSTOMER_SERVICE_LINK, link);
		clickToElement(driver, HomePageUI.FOOTER_MENU_CUSTOMER_SERVICE_LINK, link);
		return PageGeneratorManager.getUserCompareProductPage(driver);
	}

	public void addProductToCompare(String product) {
		waitForElementClickable(driver,HomePageUI.PRODUCT_BUTTON_ADD_TO_COMPARE, product);
		clickToElement(driver, HomePageUI.PRODUCT_BUTTON_ADD_TO_COMPARE, product);
	}


}
