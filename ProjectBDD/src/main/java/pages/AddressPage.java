package pages;

import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class AddressPage extends GenericWrappers{
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public UpdateAddressPage clickUpdate(){
	    clickByXpath("//span[contains(text(),'Update')]");
		return new UpdateAddressPage();
	}
	
	public AddressPage verifyCity(){
		String city = getTextByXpath("(//div[@id='center_column']//span)[6]");
		System.out.println("City of the Address verified as: "+city);
		if (city.equals("San Diego,")) {
			System.out.println("City verified same as actual and expected");
		}
		else {
			System.out.println("Failed to verify the city");
		}
		return this;
	}
	
	public AddressPage verifyState(){
		String state = getTextByXpath("(//div[@id='center_column']//span)[7]");
		System.out.println("State of the Address verified as: "+state);
		if (state.equals("California")) {
			System.out.println("State verified same as actual and expected");
		}
		else {
			System.out.println("Failed to verify the state");
		}
		return this;
	}
	
	public LoginPage clickSignOut(){
		clickByXpath("//a[@class='logout']");
		closeAllBrowsers();
		return new LoginPage(); 
	}	

}
