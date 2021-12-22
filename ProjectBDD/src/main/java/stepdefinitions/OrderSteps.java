package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.OrderPage;
import wrappers.GenericWrappers;

public class OrderSteps extends GenericWrappers{
	
	OrderPage orderPage = new OrderPage();
	
	@Then("Verify product added and click checkout")
	public void verify_product_added_and_click_checkout() {
		orderPage.verifyProductAndCheckout();
	}
	
	@Then("Click proceed to checkout")
	public void click_proceed_to_checkout() {
		orderPage.proceedCheckout();
	}
	@Then("Check terms and click checkout")
	public void check_terms_and_click_checkout() {
		
	}

}
