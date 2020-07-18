package com.capgemini.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	@FindBy(xpath = "//input[@name='placeYourOrder1']")
	private WebElement buy;
	
	
	public PlaceOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void buyproduct() {
		buy.click();
	}


}
