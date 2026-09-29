package com.flexcube.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flexcube.framework.utils.ConfigReader;

public class LoginPage extends BasePages {

	public LoginPage() {
		super();
	}

	@FindBy(id = "USERID")
	WebElement userName;

	@FindBy(id = "user_pwd")
	WebElement passWord;

	@FindBy(id = "fc_sbmit")
	WebElement signIn;

	public void login() {
		login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
	}

//	Business logic
	public void login(String username, String password) {
		enterTheField(userName, username);
		enterTheField(passWord, password);
		click(signIn);
	}
}
