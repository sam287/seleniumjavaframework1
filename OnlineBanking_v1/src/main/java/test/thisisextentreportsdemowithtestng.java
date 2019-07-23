package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class thisisextentreportsdemowithtestng {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
		
	@BeforeSuite
	public void setup() {
			htmlReporter = new ExtentHtmlReporter("extentreports.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
	}
			@BeforeTest
			public void setUptest() {
			String projectpath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
	}
	@Test
	public void test1() throws Exception{
		
		
		ExtentTest test = extent.createTest("Google Search Test 1", "This is test to validate google search function");
		driver.get("http://google.com");
		test.pass("navigated to google.com");
		
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
         // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
        @Test
    	public void test2() throws Exception{
    		
    		ExtentTest test = extent.createTest("Google Search Test 1", "This is test to validate google search function");
    		 // log(Status, details)
            test.log(Status.INFO, "This step shows usage of log(status, details)");
            // info(details)
            test.info("This step shows usage of info(details)");
            // log with snapshot
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
             // test with snapshot
            test.addScreenCaptureFromPath("screenshot.png");
	
	
	}
	@AfterSuite
	public void teardown() {
		
		extent.flush();
	}
	@AfterTest
	public void teardowntest() {
	driver.close();
	System.out.println("Test Good");
	}
		}
