package pages;

import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class TShirtPage extends GenericWrappers{
	
	public TShirtPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderPage scrollFadedTshirtClickAddCartAndCheckout() throws InterruptedException{
		Thread.sleep(2000);
		mouseOverByXpath("//div[@id='center_column']//img");
		clickByXpath("(//div[@id='center_column']//span)[9]");
		Thread.sleep(2000);
		String message = getTextByXpath("(//div[@id='layer_cart']//h2)[1]");
		System.out.println("Verified the pop-up message as: "+message);
		if (message.equals("Product successfully added to your shopping cart")) {
			System.out.println("Message verified same as actual and expected");
		}
		else {
			System.out.println("Failed to verify the message");
		}
		Thread.sleep(2000);
		clickByXpath("(//div[@id='layer_cart']//span)[14]");
		return new OrderPage();
	}

}
