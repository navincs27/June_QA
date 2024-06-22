package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id ="email")
	private WebElement emailBtn;
}

public  void loginPage() throws InterruptedException {
	
	clickTheElement(emailBtn, driver);
	inputValues(emailBtn, driver, "dhanu071998@gmail.com");
	
}