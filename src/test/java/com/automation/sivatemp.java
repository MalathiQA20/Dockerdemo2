package com.automation;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.pages.ConfirmationPage;
import automation.pages.RegistrationPage;
import automation.pages.helperlib;

public class sivatemp extends BaseTest{ 
	
	
	@Test(invocationCount = 5)
	public void registrationPage() {
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.goTo();
		registrationPage.registerNewUser(helperlib.getRandEmailId());
		registrationPage.newUserInformation(helperlib.getRandGender(), helperlib.getRandnames(), helperlib.getRandnames(), "25687$", "10", "Oct", "2000");
		registrationPage.addressDetails("123,Timber lane", "Belmonte", "California", "90011", "United States", "9875642130");
		ConfirmationPage confirmationPage = new ConfirmationPage(driver);
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",confirmationPage.confirmationText());
	}
	


}
