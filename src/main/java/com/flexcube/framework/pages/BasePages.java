package com.flexcube.framework.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flexcube.framework.utils.DriverFactory;

public class BasePages {

	WebDriver driver;
	WebDriverWait wait;

	public BasePages() {
		driver = DriverFactory.getDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void enterTheField(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}

	public void switchToFrame(WebElement frame) {
		try {
			driver.switchTo().frame(frame);
		} catch (Exception e) {
			System.out.println("Switch to frame failed.");
		}
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	public void clickInFrame(WebElement frame, WebElement element) {
		switchToFrame(frame);
		click(element);
		switchToDefaultContent();
	}
}
