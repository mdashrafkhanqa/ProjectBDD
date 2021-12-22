package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	
	
	public LoginPage enterEmail() {
		email.sendKeys(prop.getProperty("EM"));
		return this;
	}
	
	public LoginPage enterPassword() {
		password.sendKeys(prop.getProperty("PW"));
		return this;
	}
	
	public AccountPage clickLogin() {
		clickById("SubmitLogin");
		return new AccountPage();
	}

}
