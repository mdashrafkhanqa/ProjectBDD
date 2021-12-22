package pages;

import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class OrderPage extends GenericWrappers{
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderPage verifyProductAndCheckout(){
		String product = getTextByXpath("(//a[contains(text(),'Faded Short Sleeve T-shirts')])[2]");
		System.out.println("Product in Shopping Cart verified as: "+product);
		if (product.equals("Faded Short Sleeve T-shirts")) {
			System.out.println("Product verified same as actual and expected");
		}
		else {
			System.out.println("Failed to verify the product");
		}
		clickByXpath("(//a[@title='Proceed to checkout'])[2]");
		return this;
	}
	
	public OrderPage proceedCheckout(){
		clickByXpath("//button[@name='processAddress']");
		return this;
	}
	
	public OrderPage checkTermsAndCheckout() throws InterruptedException{
		clickByXpath("//input[@id='cgv']");
		Thread.sleep(2000);
		clickByXpath("//button[@name='processCarrier']");
		return this;
	}
	

}
