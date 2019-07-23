package com.banking.testcases;


import org.testng.annotations.Test;
import com.banking.pageobject.loginpage;
import junit.framework.Assert;

public class TC_login_001 extends baseclass 

{
	public static void main(String[] args) {
		
	}
	@Test
	public void logintest()
	{
		driver.get(baseURL);
		loginpage lp=new loginpage(driver);
		lp.setUserName(userid);
		lp.setPassWord(password);
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Home Page"))
		{
			Assert.assertTrue(true);
		}
		else
		{
		 	Assert.assertFalse(false);
		}
	}

}

			
	
	

