package com.productpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage {
	
	@FindBy(xpath = "//a[text()='Add Your Review']")
	private WebElement review;
	
	WebDriver driver = new ChromeDriver();
	

}
