package com.parabank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	 private WebDriver driver;
	    private WebDriverWait wait;
	    
	    @FindBy(xpath = "//a[contains(.,'Register')]")
	    private WebElement registerLinkElement;
	    
	    @FindBy(id = "customer.firstName")
	    private WebElement firstNamElement;
	    
	    @FindBy(id = "customer.lastName")
	    private WebElement lastNamElement;
	    
	    @FindBy(id = "customer.address.street")
	    private WebElement addressElement;
	    
	    @FindBy(id = "customer.address.city")
	    private WebElement cityElement;
	    
	    @FindBy(id = "customer.address.state")
	    private WebElement statElement;
	    
	    @FindBy(id = "customer.address.zipCode")
	    private WebElement zipCodElement;
	    
	    @FindBy(id = "customer.phoneNumber")
	    private WebElement phoneNumberElement;
	    
	    @FindBy(id = "customer.ssn")
	    private WebElement ssnElement;
	    
	    @FindBy(id = "customer.username")
	    private WebElement userNamElement;
	    
	    @FindBy(id = "customer.password")
	    private WebElement passwordElement;
	    
	    @FindBy(id = "repeatedPassword")
	    private WebElement confirmPassword;
	    
	    @FindBy(xpath = "//input[@class='button']")
	    private WebElement registerButton;
	    
	    public RegistrationPage(WebDriver driver) {
	    	this.driver = driver;
	    	this.wait=new WebDriverWait(driver,30);
	        PageFactory.initElements(driver,this);
	    }
	    
	    public void goTo() {
	    	this.driver.get("https://parabank.parasoft.com/parabank/index.htm");
	        this.wait.until(ExpectedConditions.visibilityOf(this.registerLinkElement));
	    }
	    
	    public void registerNewUser(String fname,String lname,String address,String city,String state,String zipCode) {
	    	this.registerLinkElement.click();
	    	this.wait.until(ExpectedConditions.visibilityOf(this.firstNamElement));
	    	this.firstNamElement.sendKeys(fname);
	    	this.lastNamElement.sendKeys(lname);
	    	this.addressElement.sendKeys(address);
	    	this.cityElement.sendKeys(city);
	    	this.statElement.sendKeys(state);
	    	this.zipCodElement.sendKeys(zipCode);
	    }
	    
	    public void userPersonalInformation(String phoneNo,String SSN,String userName,String pwd,String confirmPwd) {
	    	this.phoneNumberElement.sendKeys(phoneNo);
	    	this.ssnElement.sendKeys(SSN);
	    	this.userNamElement.sendKeys(userName);
	    	this.passwordElement.sendKeys(pwd);
	    	this.confirmPassword.sendKeys(confirmPwd);
	    	this.registerButton.click();
	    }

}
