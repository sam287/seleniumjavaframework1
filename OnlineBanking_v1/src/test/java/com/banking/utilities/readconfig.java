package com.banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	
		Properties  pro;
		
		public readconfig()
		{
			File src = new File ("./configaration files/config.properties");
			try {
					FileInputStream fis = new FileInputStream(src);
					pro = new Properties();
					pro.load(fis);
					} catch (Exception e ) {
						System.out.println("Exception is " + e.getMessage());
				}}

	public String getapplicationurl()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getusername()
	{
		String username=pro.getProperty("userid");
		return username;				
	}
	public String getpasswordpath()
	{
		String password= pro.getProperty("password");
		return password;	
	}
	public String getgeckopath()
	{
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	public String getiepath()
	{
	String ie=pro.getProperty("iepath");
	return ie;
	}
	public String getfirefoxpath()
	{
		String firefox=pro.getProperty("firefoxpath");
		return firefox;
	}
}
