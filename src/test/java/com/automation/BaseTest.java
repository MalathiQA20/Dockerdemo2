package com.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
protected WebDriver driver;

   @BeforeMethod
   public void setupDriver() throws MalformedURLException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\malat\\Downloads\\chromedriver_win32\\chromedriver.exe");
	this.driver = new ChromeDriver();
	 /*String completeUrl = "http://192.168.86.39:4444/wd/hub";
     DesiredCapabilities dc = new DesiredCapabilities();
     dc  = DesiredCapabilities.firefox();
     this.driver = new RemoteWebDriver(new URL(completeUrl),dc);*/
}

   @AfterMethod
    public void closeDriver() {
	this.driver.quit();
}

}

