package pageObject.ultimateQA;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUI.ultimateQA.UI_LoginPage;

public class PageObjectLogin extends BasePage{
	WebDriver driver;
	
	public PageObjectLogin(WebDriver driver) {
		this.driver = driver;
	}

	public PageObjectRegister clickbyText(String Buttontext) {
		waitForElementClickable(driver, UI_LoginPage.BUTTON_BY_TEXT, Buttontext);
		clickToElement(driver, UI_LoginPage.BUTTON_BY_TEXT, Buttontext);
		
		return PageGeneratorManager.getRegisterPage(driver);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForAllElementsVisible(driver, UI_LoginPage.LOCATOR_WITH_XCLASS_EVERYWHERE, "form-error__list-item");
		return getElementAttribute(driver, UI_LoginPage.LOCATOR_WITH_XCLASS_EVERYWHERE, "form-error__list-item", "innerText");
	}

	public void inputValueField(String fieldID, String value) {
		waitForAllElementsVisible(driver, UI_LoginPage.TEXTBOX_WITH_ID, fieldID);
		sendkeyToElement(driver, UI_LoginPage.TEXTBOX_WITH_ID, value, fieldID);
		
	}

	
}
