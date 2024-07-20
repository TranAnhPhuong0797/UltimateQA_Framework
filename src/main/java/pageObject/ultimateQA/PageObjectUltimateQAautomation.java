package pageObject.ultimateQA;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUI.ultimateQA.UI_ultimateautomatePage;

public class PageObjectUltimateQAautomation extends BasePage{
	WebDriver driver;
	
	public PageObjectUltimateQAautomation(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyHeaderVisible(String headerText) {
		waitForElementVisible(driver, UI_ultimateautomatePage.LOCATOR_HEADER_MENU_WITH_TEXT, headerText);
		isElementDisplayed(driver, UI_ultimateautomatePage.LOCATOR_HEADER_MENU_WITH_TEXT, headerText);
	}

	public void verifyFooterVisible(String footerText) {
		waitForElementVisible(driver, UI_ultimateautomatePage.LOCATOR_FOOTER_MENU_WITH_TEXT, footerText);
		isElementDisplayed(driver, UI_ultimateautomatePage.LOCATOR_FOOTER_MENU_WITH_TEXT, footerText);
	}
	
	
	
	
	
	

}
