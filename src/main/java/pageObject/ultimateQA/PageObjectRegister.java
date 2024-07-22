package pageObject.ultimateQA;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import pageUI.ultimateQA.UI_RegisterPage;

public class PageObjectRegister extends BasePage{
	WebDriver driver;
	
	public PageObjectRegister(WebDriver driver) {
		this.driver = driver;
	}
	public void clickbyText(String text) {
		waitForElementClickable(driver, UI_RegisterPage.BUTTON_WITH_TEXT, text);
		clickToElement(driver, UI_RegisterPage.BUTTON_WITH_TEXT, text);
		
	}

	public void verifyErrorMessageVisible(String string) {
		// TODO Auto-generated method stub
		
	}

	public void inputValueField(String fieldID, String value) {
		waitForAllElementsVisible(driver, UI_RegisterPage.TEXTBOX_WITH_ID, fieldID);
		sendkeyToElement(driver, UI_RegisterPage.TEXTBOX_WITH_ID, value, fieldID);
	}

	public void selectCheckbox(String checkbox) {
		waitForAllElementsVisible(driver, UI_RegisterPage.TEXTBOX_WITH_ID, checkbox);
		clickToElement(driver, UI_RegisterPage.TEXTBOX_WITH_ID, checkbox);
	}
	
	
	
	
	
	

}
