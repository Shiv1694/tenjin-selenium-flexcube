package com.flexcube.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class CIF_CreationPage extends BasePages {

	public CIF_CreationPage() {
		super();
	}

	@FindBy(id = "New")
	WebElement newButton;

	@FindBy(id = "BLK_CUSTOMER__BTN_P")
	WebElement customerButton;

	@FindBy(id = "BLK_CUSTOMER__SNAME")
	WebElement shortName;

	@FindBy(id = "BLK_CUSTOMER__CCATEG")
	WebElement customerCategory;

	@FindBy(xpath = "//input[contains(@id,'BLK_CUSTOMER__ADDRLN') and @title='Address 1']")
	WebElement address1;

	@FindBy(id = "BLK_CUSTOMER__COUNTRY")
	WebElement country;

	@FindBy(id = "BLK_CUSTPERSONAL__SEX")
	WebElement male;

	@FindBy(id = "BLK_CUSTPERSONAL__DOBI")
	WebElement dob;

	@FindBy(id = "BLK_CUSTOMER__NLTY")
	WebElement nationlity;

	@FindBy(id = "BLK_CUSTPERSONAL__NAME")
	WebElement guradian;

	@FindBy(id = "BLK_CUSTPERSONAL__MINOR")
	WebElement minorCheckbox;

	@FindBy(id = "BLK_CUSTPERSONAL__PCNTRY")
	WebElement personalCountry;

	@FindBy(id = "BLK_CUSTPERSONAL__BIRTH_COUNTRY")
	WebElement customerBirthCountry;

	@FindBy(id = "BLK_CUSTPERSONAL__LANG")
	WebElement customerLanguage;

	@FindBy(xpath = "//li[@id='Save']")
	WebElement saveButton;

	@FindAll({ @FindBy(xpath = "//iframe[@id='ifr_LaunchWin']") })
	WebElement ifrLaunchWinFrame;

	public void cifDetails(String shortNameVal, String categoryVal, String addressVal, String personalCountryVal,
			String nationalityVal, String guardianVal, String dobVal, String countryVal, String birthCountryVal,
			String languageVal) {
		System.out.println("cif details starts.");
		clickInFrame(ifrLaunchWinFrame, newButton);
		switchToFrame(ifrLaunchWinFrame);
		click(customerButton);
		enterTheField(shortName, shortNameVal);
		enterTheField(customerCategory, categoryVal);
		enterTheField(address1, addressVal);
		enterTheField(personalCountry, personalCountryVal);
		enterTheField(nationlity, nationalityVal);
		enterTheField(guradian, guardianVal);
		click(minorCheckbox);
		click(male);
		enterTheField(dob, dobVal);
		enterTheField(country, countryVal);
		enterTheField(customerBirthCountry, birthCountryVal);
		enterTheField(customerLanguage, languageVal);
		System.out.println("cif details ends");
	}

	public void clickSaveButton() {
		System.out.println("click on save button start");
		clickInFrame(ifrLaunchWinFrame, saveButton);
		System.out.println("click on save button ends");
	}

}
