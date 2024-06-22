package com.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	protected void passInput(WebDriver driver,WebElement element, String input) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.elementToBeClickable(element))
			.sendKeys(input);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected String getText(WebDriver driver,WebElement element) {
		try {
			return element.getText();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
