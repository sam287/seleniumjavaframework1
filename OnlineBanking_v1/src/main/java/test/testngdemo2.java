package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.googlesearchpage;


public class testngdemo2 {
	
	static WebDriver driver = null;
	
	@BeforeTest
		public void setUptest() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		
	}
	@Test
		public static void googlesearch2() {
		driver.get("http://google.com");
		googlesearchpage.testbox_search(driver).sendKeys("ABCD");
		googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
	}
	
	@Test
	public static void googlesearch3() {
	driver.get("http://google.com");
	googlesearchpage.testbox_search(driver).sendKeys("ABCD");
	googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
}
	@AfterTest
		public void teardowntest() {
		driver.close();
		System.out.println("Test Good");
		}
				
	}

