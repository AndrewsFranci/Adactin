package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver getDriver(String BrowserName) {

		try {
			if (BrowserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Andrews Francis\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (BrowserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Andrews Francis\\eclipse-workspace\\SeleniumProject\\Driver\\IEDriverServer.exe");
			} else if (BrowserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Andrews Francis\\eclipse-workspace\\SeleniumProject\\Driver\\IEDriverServer.exe");
			} else
				System.out.println("Invalid browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void currenturl() {

		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Clickonelement(WebElement element) {
		element.click();
	}

	public static void Sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		
	}

	public static void frame() {
		driver.switchTo().frame(0);
	}

	public static void dropDown(WebElement element, String value, String option) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}

}
