package com.capgemini.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage {
	@FindBy(xpath="//a[contains(text(),'Deliver to this address')]")
	private WebElement address;
	
	public DeliveryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void deliveryAddress() {
		address.click();
	}

}
