package com.Test_actiTIME.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver idriver;
	public Login(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id = "username")
	WebElement txtUserName;

	@FindBy(name = "pwd")
	WebElement txtPassword;

	@FindBy(xpath = "//div[text()='Login ']")
	WebElement submitLogin;

	public void setUsername(String userName)
	{
		txtUserName.sendKeys(userName);
	}
	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	public void clickLogin()
	{
		submitLogin.click();
	}

}
