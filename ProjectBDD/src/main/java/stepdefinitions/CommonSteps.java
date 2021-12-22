package stepdefinitions;

import io.cucumber.java.en.Given;
import wrappers.GenericWrappers;

public class CommonSteps extends GenericWrappers{
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		invokeApp("chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

}
