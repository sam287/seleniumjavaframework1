package com.banking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver ldriver;
	
	public loginpage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name= "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement txtbtnLogin;
	
	public void setUserName(String  uname)
	{
		txtUserName.sendKeys(uname);
	}
	public void setPassWord(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}

	public void clicksubmit()
	{
		 txtbtnLogin.click();
	}
}