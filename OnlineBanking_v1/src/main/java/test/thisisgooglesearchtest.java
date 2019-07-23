package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.googlesearchpage;


@SuppressWarnings("unused")
public class thisisgooglesearchtest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
	}

	@SuppressWarnings("unused")
	public static void googlesearch() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		googlesearchpage.testbox_search(driver).sendKeys("ABCD");
		googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test Good");
	}
}
