package com.capgemini.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement srchbar;

	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
	private WebElement search;

	@FindBy(xpath = "//div[@class='a-section a-spacing-medium']")
	private WebElement product;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void search(String name) {
		srchbar.sendKeys(name);
	}

	public void searchBar() {
		search.click();
	}

	public void productname() throws InterruptedException {
		product.click();
		//driver.switchTo().window("Disposable Air Pollution &amp; Protection Mask Face Mask Nose Mask Dust Mask surgical mask with tie (50): Amazon.in: Car &amp; Motorbike");
		/*
		 * String handle= driver.getWindowHandle(); for (String handle1 :
		 * driver.getWindowHandles()) {
		 * 
		 * driver.switchTo().window(handle1); }
		 */
		
		/*
		 * Set<String> whs= driver.getWindowHandles(); for(String str: whs) {
		 * driver.switchTo().window(str); }
		 */
		Thread.sleep(5000);

	}

}
