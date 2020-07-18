package com.capgemini.stepdefinition;

import com.capgemini.base.TestBase;
import com.capgemini.order.page.DeliveryPage;
import com.capgemini.order.page.PaymentPage;
import com.capgemini.order.page.PlaceOrderPage;
import com.capgemini.order.page.ProductPage;
import com.capgemini.order.page.SearchPage;

import cucumber.api.java.en.Then;

public class PlaceProductStepDefinition extends TestBase {
	SearchPage sp = new SearchPage(driver);

	@Then("^search for the product$")
	public void search_for_the_product() throws Throwable {
		sp.search("mask");
		sp.searchBar();
		sp.productname();

	}

	ProductPage pg = new ProductPage(driver);

	@Then("^click on buy now$")
	public void click_on_buy_now() throws Throwable {
		//driver.switchTo().window("Select a Payment Method - Amazon.in Checkout");
		pg.buyNow();

	}

	DeliveryPage dp = new DeliveryPage(driver);

	@Then("^choose the delivery address$")
	public void choose_the_delivery_address() throws Throwable {
		dp.deliveryAddress();

	}

	PaymentPage pp = new PaymentPage(driver);

	@Then("^choose the mode of payment$")
	public void choose_the_mode_of_payment() throws Throwable {
		pp.selectbutton();
		pp.number("9492217658@apl");
		pp.valid();
		pp.continued();

	}

	PlaceOrderPage pop = new PlaceOrderPage(driver);

	@Then("^Place an order$")
	public void place_an_order() throws Throwable {
		pop.buyproduct();

	}
}
