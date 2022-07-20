package com.bit.steps;

import com.bit.cucumber.TestContext;
//import cucumber.api.java.en.When;
import com.bit.pageObjects.CartPage;
import io.cucumber.java.en.When;

public class CartPageSteps {
	
	TestContext testContext;
	CartPage cartPage;
	
	public CartPageSteps(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();
	}
	
	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart(){
		cartPage.clickOn_Cart();
		cartPage.clickOn_ContinueToCheckout();	
	}

}
