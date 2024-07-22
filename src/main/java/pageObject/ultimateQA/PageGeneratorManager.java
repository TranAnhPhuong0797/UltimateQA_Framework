package pageObject.ultimateQA;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static PageObjectRegister getRegisterPage(WebDriver driver) {
		return new PageObjectRegister(driver);
	}
	
	public static PageObjectLogin getLoginPage(WebDriver driver) {
		return new PageObjectLogin(driver);
	}
	

}
