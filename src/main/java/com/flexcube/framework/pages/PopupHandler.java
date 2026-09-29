package com.flexcube.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class PopupHandler extends BasePages {

	public PopupHandler() {
		super();
	}

	@FindAll({ @FindBy(id = "ifr_AlertWin"), @FindBy(xpath = "//iframe[@title ='Information Message']") })
	WebElement ifrAlertWinFrame;

	@FindBy(id = "BTN_OK")
	WebElement okButton;

	@FindBy(id = "ifrSubScreen")
	WebElement ifrSubScreenFrame;

	@FindBy(id = "REMARKS")
	WebElement remarks;

	@FindBy(id = "BTN_ACCEPT")
	WebElement acceptButton;

	@FindBy(xpath = "//table[@id='ERRTBL']//span[@class='SPNtbltwoC']")
	WebElement successMsg;

	@FindBy(id = "WNDbuttons")
	WebElement closeButton;

	@FindBy(id = "ifr_LaunchWin")
	WebElement ifrLaunchWinFrame;

	public void clickOkButton() {
		clickInFrame(ifrAlertWinFrame, okButton);
	}

	public void remarksField() {
		switchToFrame(ifrLaunchWinFrame);
		switchToFrame(ifrSubScreenFrame);
		enterTheField(remarks, "success");
		switchToDefaultContent();
	}

	public void clickRemarksOkButton() {
		switchToFrame(ifrLaunchWinFrame);
		switchToFrame(ifrSubScreenFrame);
		click(okButton);
		switchToDefaultContent();
	}

	public void clickAcceptButton() {
		switchToFrame(ifrLaunchWinFrame);
		clickInFrame(ifrAlertWinFrame, acceptButton);
	}

	public String getSuccessMsg() {
		switchToFrame(ifrLaunchWinFrame);
		switchToFrame(ifrAlertWinFrame);
				String message = getText(successMsg);
				switchToDefaultContent();
				return message;
	}

	public void clickCloseButton() {
		clickInFrame(ifrLaunchWinFrame, closeButton);
	}
	public void clickInfoOkButton() {
		switchToFrame(ifrLaunchWinFrame);
		switchToFrame(ifrAlertWinFrame);
		click(okButton);
		switchToDefaultContent();
	}
}
