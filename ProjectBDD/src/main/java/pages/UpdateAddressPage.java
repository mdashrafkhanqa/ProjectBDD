package pages;

import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class UpdateAddressPage extends GenericWrappers{
	
	public UpdateAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public UpdateAddressPage enterCity(String city){
		enterByXpath("//input[@id='city']", ""+city+"");
		return this; 
	}
	
	public UpdateAddressPage enterState(String value){
		selectVisibileTextByXPath("//select[@id='id_state']", value);
		return this; 
	}
	
	public AddressPage clickSave() {
		clickByXpath("//button[@id='submitAddress']");
		return new AddressPage();
	}

}
