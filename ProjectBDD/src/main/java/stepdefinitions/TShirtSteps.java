package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.TShirtPage;
import wrappers.GenericWrappers;

public class TShirtSteps extends GenericWrappers{
	
	TShirtPage tshirtPage = new TShirtPage();
	
	@Then("Scroll to faded short sleeve Tshirt and click add cart and checkout")
	public void scroll_to_faded_short_sleeve_Tshirt_and_click_add_cart_and_checkout() throws InterruptedException {
		tshirtPage.scrollFadedTshirtClickAddCartAndCheckout();
	}

}
