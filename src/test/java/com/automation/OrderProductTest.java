package com.automation;

import org.testng.annotations.Test;

import automation.pages.ProductSelectionPage;
import automation.pages.SignInPage;

public class OrderProductTest extends BaseTest {
	
	@Test
	public void RegisteredCustomerSigIn() {
		SignInPage signInPage = new SignInPage(driver);
		signInPage.goTo();
		signInPage.customerSignIn("Jhondoe2@Twilight.com", "25687$");
	}
	
	@Test
	public void orderProduct() {
		ProductSelectionPage productSelectionPage = new ProductSelectionPage(driver);
		productSelectionPage.orderProduct();
	}

}
