package demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class orange {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe" );

		driver = new ChromeDriver();
		baseUrl = "https://www.katalon.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("opensource.demo.orangehrmlive.com");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Demo'])[1]/following::h3[1]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Do The Work You Love'])[1]/following::a[1]")).click();
		driver.findElement(By.id("Form_submitForm_subdomain")).click();
		driver.findElement(By.id("Form_submitForm_subdomain")).clear();
		driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("abc");
		driver.findElement(By.id("Form_submitForm_FirstName")).click();
		driver.findElement(By.id("Form_submitForm_FirstName")).clear();
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("hello");
		driver.findElement(By.id("Form_submitForm_LastName")).click();
		driver.findElement(By.id("Form_submitForm_LastName")).clear();
		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("how are u");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
