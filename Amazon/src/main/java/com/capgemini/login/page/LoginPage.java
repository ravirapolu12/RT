package com.capgemini.login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.TestBase;

public class LoginPage extends TestBase{
	Actions a ;

	
	@FindBy(xpath="//a[@id='nav-link-accountList']") 
	private WebElement w1;
	 
	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']")
	private WebElement login;
	
	@FindBy(xpath="//input[@type='email']") 
	private WebElement name;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	public LoginPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void account() throws InterruptedException {
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(w1).perform();
		
	}
	 
	
	public void logIn() {
		login.click();
	}
	
	public void setEmail(String email) { 
		name.sendKeys(email);
	}
	
	public void clickOnContinue() {
		cont.click();
	}
	
	public void setPassword(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void signIn() {
		signin.click();
	}


}
