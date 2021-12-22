package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UpdateAddressPage;
import wrappers.GenericWrappers;

public class UpdateAddressSteps extends GenericWrappers{
	
	UpdateAddressPage updateAddressPage = new UpdateAddressPage();
	
	@Then("Enter city as \"([^\"]*)\"$")
	public void enter_city_as(String city) {
		updateAddressPage.enterCity(city);
	}
	
	@Then("Enter state as \"([^\"]*)\"$")
	public void enter_state_as(String value) {
		updateAddressPage.enterState(value);
	}
	
	@When("Click save")
	public void click_save() {
		updateAddressPage.clickSave();
	}

}
