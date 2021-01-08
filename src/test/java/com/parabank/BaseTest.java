package com.parabank;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setupDriver() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();

}
	@AfterMethod
	 public void closeDriver() {
		this.driver.quit();
}
}
