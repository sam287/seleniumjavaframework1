package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class thisisextentreportbasicdemo {
	
	private static WebDriver driver = null;
			
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test 1", "This is test to validate google search function");
        
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "starting test case");
		driver.get("http://google.com");
		test1.pass("navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Enter text");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Press Keyboard Enter Key");
		
		driver.close();
		driver.quit();
		test1.pass("close the browser");
		
		test1.info("test compeleted");
		
		extent.flush();
	}

}
