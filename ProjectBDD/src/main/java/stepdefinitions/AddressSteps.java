package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddressPage;
import wrappers.GenericWrappers;

public class AddressSteps extends GenericWrappers{
	
	AddressPage addressPage = new AddressPage();
	
	@When("Click update")
	public void click_update() {
		addressPage.clickUpdate();
	}
	
	@Then("Verify city")
	public void verify_city() {
		addressPage.verifyCity();
	}
	
	@Then("Verify state")
	public void verify_state() {
		addressPage.verifyState();
	}
	
	@Then("Click signout")
	public void click_signout() {
		addressPage.clickSignOut();
	}

}
