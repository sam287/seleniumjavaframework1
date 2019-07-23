package com.banking.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.banking.utilities.readconfig;

public class baseclass {
	
	readconfig Readconfig = new readconfig();
	
	
	public String baseURL = Readconfig.getapplicationurl();
	public String userid = Readconfig.getusername();
	public String password = Readconfig.getpasswordpath();
	public static WebDriver driver;
	
	@BeforeClass

	public void setup()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Suhas\\Desktop\\geckodriver.exe");
	driver=new FirefoxDriver();
	
}

	@AfterClass
	
	public void teadDown()
{
	driver.quit();
}

}
