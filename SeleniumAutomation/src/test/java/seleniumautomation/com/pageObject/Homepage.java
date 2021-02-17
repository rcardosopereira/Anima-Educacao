package seleniumautomation.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumautomation.com.utils.Utils;

public class Homepage {
	
	private WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSignInBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"index-banner\"]/div/div[3]/a"), 30);
	}
	
	
}
