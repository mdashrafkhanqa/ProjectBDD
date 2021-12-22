package pages;

import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class AccountPage extends GenericWrappers{
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AddressPage clickMyAddresses(){
	    clickByXpath("//span[contains(text(),'My addresses')]");
		return new AddressPage();
	}
	
	public TShirtPage mouseOverWomenClickTshirt(){
	    mouseOverByXpath("//a[@title='Women']");
	    clickByXpath("(//a[@title='T-shirts'])[1]");
		return new TShirtPage();
	}

}
