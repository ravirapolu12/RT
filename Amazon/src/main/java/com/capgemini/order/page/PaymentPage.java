package com.capgemini.order.page;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {
	WebDriver driver;
	// @FindBy(xpath = "(//span[@class='pmts-indiv-issuer-image'])[1]")
	@FindBy(xpath = "//input[@id='pp-BqH0bZ-125']")
	private WebElement w3;

	@FindBy(xpath = "//input[@id='pp-gEmc3M-133']")
	private WebElement num;

	@FindBy(xpath = "//input[contains(@name,'ppw-widgetEvent:ValidateUpiIdEvent')]")
	private WebElement verify;

	@FindBy(xpath = "//span[@id='pp-gEmc3M-160']")
	private WebElement clickcntd;

	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectbutton() throws InterruptedException {

		/*
		 * Select s1 = new Select(w3); s1.selectByValue("Other UPI IDs");
		 */

		Thread.sleep(5000);
		w3.click();
	}

	public void number(String value) {
		num.sendKeys(value);
	}

	public void valid() {
		verify.click();
	}

	public void continued() {
		clickcntd.click();
	}

}
