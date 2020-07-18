package com.capgemini.order.page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.TestBase;

public class ProductPage {
	
	@FindBy(xpath = "//*[@id=\"submit.buy-now\"]")
	private WebElement button;

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void buyNow() throws InterruptedException {

		Set<String> whs = TestBase.driver.getWindowHandles();
		for (String str : whs) {
			TestBase.driver.switchTo().window(str);
		}
		
		Thread.sleep(2000);
		button.click();
	}

}
