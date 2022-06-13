package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//1. By Locators (or) Object Repositories:
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signbutton = By.id("SubmitLogin");
	private By forgetpwdlink = By.linkText("Forgot your password?");
	
	//2.Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3.page actions: features(behavior) of the page the form of method:
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgetPasswordLinkExist() {
		return driver.findElement(forgetpwdlink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(signbutton).click();
	}
	
	public AccountPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + "and" + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signbutton).click();
		return new AccountPage(driver);
	}
	
}