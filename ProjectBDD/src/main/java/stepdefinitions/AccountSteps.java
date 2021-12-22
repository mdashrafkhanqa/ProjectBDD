package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import wrappers.GenericWrappers;

public class AccountSteps extends GenericWrappers{
	
	AccountPage accountPage = new AccountPage();
	
	@When("Click my addresses")
	public void click_my_addresses() {
		accountPage.clickMyAddresses();
	}
	
	@Then("Mouse hover women tab and click Tshirt")
	public void mouse_hover_women_tab_and_click_Tshirt() {
		accountPage.mouseOverWomenClickTshirt();
	}

}
