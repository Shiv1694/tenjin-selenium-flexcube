package com.flexcube.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePages {
	@FindBy(xpath = "//a[text()='Sign Off']")
	WebElement logout;

	@FindBy(id = "BTN_OK")
	WebElement okButton;
	@FindBy(id = "ifr_AlertWin")
	WebElement ifr_AlertWinFrame;

	public void logout() {
		click(logout);
		clickInFrame(ifr_AlertWinFrame,okButton);
		switchToDefaultContent();
	}
}
