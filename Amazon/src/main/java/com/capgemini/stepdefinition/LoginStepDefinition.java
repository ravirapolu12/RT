package com.capgemini.stepdefinition;

import com.capgemini.base.TestBase;
import com.capgemini.login.page.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition extends TestBase {

	LoginPage l;
	//LoginPage l=new LoginPage();

	@Given("^open browser$")
	public void open_browser() throws Throwable {
		TestBase.openBrowser("chrome");

	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws InterruptedException {
		
		l=new LoginPage(driver);
		l.account();
		l.logIn();

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		l.setEmail("upender.shivu@gmail.com");
		l.clickOnContinue();
		l.setPassword("Upender@1");

	}

	@Then("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		l.signIn();

	}

}
