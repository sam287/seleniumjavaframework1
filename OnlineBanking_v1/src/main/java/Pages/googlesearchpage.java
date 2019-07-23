package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpage {

	public static WebElement element = null;
	
	public static WebElement  testbox_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;			
	}	
	public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
				
	}
}
