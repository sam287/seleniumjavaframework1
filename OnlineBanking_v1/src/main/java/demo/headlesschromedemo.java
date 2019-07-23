package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesschromedemo {
					public static void main(String[] args) {
						test();
					}
	public static void test( ) {

		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe" );
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless" );
		options.addArguments("window-size=1366, 768");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();


	}

}
