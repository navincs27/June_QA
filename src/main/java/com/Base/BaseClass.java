package com.Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {	
	protected static WebDriver driver;
	protected static WebDriver browserLaunch(String name) {
		
		if (name.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("incognito");
			option.addArguments("--remote-allow-origins*-");
			driver = new ChromeDriver(option);
								} else if (name.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
	} else if  (name.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
				}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
}

protected static void launchURL(WebDriver driver , String url) {
	try {
		driver.get("https://magento.softwaretestingboard.com/");
	} catch (Exception e) {
	e.printStackTrace();
		}

}
protected static void inputValues(WebElement element, WebDriver driver, String Value) {
	try {
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(Value);
			} catch (Exception e) {
				e.printStackTrace();
			}
}

	
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
