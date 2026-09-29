//package com.flexcube.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.flexcube.framework.base.BaseTest;
import com.flexcube.framework.pages.CIF_CreationPage;
import com.flexcube.framework.pages.LoginPage;
import com.flexcube.framework.pages.LogoutPage;
import com.flexcube.framework.pages.MenuPage;
import com.flexcube.framework.pages.PopupHandler;
import com.flexcube.framework.utils.JavaUtils;
import com.flexcube.framework.utils.WebDriverUtility;

@Listeners(com.flexcube.framework.listeners.TestListener.class)
public class Cif_CreationTest extends BaseTest {

	@Test
	public void cifCreationTest() {

		MenuPage menuPage = new MenuPage();
		LoginPage loginPage = new LoginPage();
		PopupHandler popupHandler = new PopupHandler();
		CIF_CreationPage cifPage = new CIF_CreationPage();
		LogoutPage logoutPage = new LogoutPage();

		loginPage.login();
		popupHandler.clickOkButton();

		menuPage.enterMenu("STDCIF");
		WebDriverUtility.captureScreenshot("after login");
		cifPage.cifDetails(JavaUtils.generateRandomString(7), "CC01", JavaUtils.generateRandomString(6), "IN", "IN",
				"bcuds", "2014-07-23", "IN", "AAA", "ARB");
		WebDriverUtility.captureScreenshot("after details entered");
		cifPage.clickSaveButton();
		popupHandler.remarksField();
		WebDriverUtility.captureScreenshot("remarks");
		
		popupHandler.clickRemarksOkButton();
		
		
		popupHandler.clickAcceptButton();
		WebDriverUtility.captureScreenshot("accept button");
		String message = popupHandler.getSuccessMsg();
		
		Assert.assertEquals(message, "Record Successfully Saved and Authorized",
				"CIF creation did not succeed. Actual message: " + message);
//		System.out.println("Result message :" + message);

		popupHandler.clickInfoOkButton();
		popupHandler.clickCloseButton();
		logoutPage.logout();
	}
}
