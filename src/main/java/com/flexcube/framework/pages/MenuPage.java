package com.flexcube.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePages {

	public MenuPage() {
		super();
	}

	@FindBy(id = "fastpath")
	WebElement fastPath;

	@FindBy(id = "btnGo")
	WebElement goButton;

	public void enterMenu(String menu) {
		enterTheField(fastPath, menu);
		click(goButton);
	}

}
