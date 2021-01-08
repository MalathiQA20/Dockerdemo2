package com.automation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.pages.ConfirmationPage;
import automation.pages.RegistrationPage;

public class RegistrationTest extends BaseTest{
	
	@Test
	@Parameters({"emailID","genderOption","fname","lname","day","month","year"})
	public void registrationPage(String emailID,String genderOption,String fname,String lname,String day,String month,String year) {
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.goTo();
		registrationPage.registerNewUser(emailID);
		registrationPage.newUserInformation(genderOption, fname, lname, "25687$", day, month, year);
		registrationPage.addressDetails("123,Timber lane", "Belmonte", "California", "90011", "United States", "9875642130");
		
	}
	
	@Test(dependsOnMethods = "registrationPage")
	public void registrationConfirmationPage() {
		ConfirmationPage confirmationPage = new ConfirmationPage(driver);
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",confirmationPage.confirmationText());
	}
	

}
