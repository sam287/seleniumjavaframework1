package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoMultiBrowserDemo {

	WebDriver driver = null;
	@Parameters ("browserName")
	@BeforeTest
	public void Setup(String browserName ) {
		System.out.println("Browser Name :" + browserName);
		if (browserName.equalsIgnoreCase("chrome")){
			String projectpath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
	}
		else if (browserName.equalsIgnoreCase("firefox")) {
			String projectpath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("ie")) {
			String projectpath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/IEDriverServer.exe" );
			driver = new InternetExplorerDriver();
		}
	}
	@Test
	public void test1( ) throws Exception {
		driver.get("https:/google.com");
		Thread.sleep(4000);
		driver.close();
		System.out.println("Test Compeleted Sucessfully");
	}
}


