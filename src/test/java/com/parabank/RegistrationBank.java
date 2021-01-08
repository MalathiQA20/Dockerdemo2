package com.parabank;

import org.testng.annotations.Test;

public class RegistrationBank extends BaseTest {
	
	@Test(invocationCount = 5)
	public void registerUser() {
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.goTo();
		registrationPage.registerNewUser(helperlib.getRandnames(), helperlib.getRandnames(), helperlib.getRandString(), helperlib.getRandnames(), helperlib.getRandnames(), "12345");
		registrationPage.userPersonalInformation("9874562310", "25879461", helperlib.getRandnames(), "Same", "Same");
		
	}

}
