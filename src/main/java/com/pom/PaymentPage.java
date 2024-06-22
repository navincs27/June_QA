package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	
	@FindBy(xpath = "(//button[@type='submit'])[3])")
	public WebElement nextbtn;
	
}
