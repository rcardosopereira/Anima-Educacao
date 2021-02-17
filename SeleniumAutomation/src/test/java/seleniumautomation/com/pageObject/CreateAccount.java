package seleniumautomation.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumautomation.com.utils.Utils;

public class CreateAccount {
	
	private WebDriver driver;
	
	public CreateAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCreateAccountForm() {
		return Utils.waitForElementPresence(driver, By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"), 30);                                                  
	}
	
	public WebElement getCreatAccountUserField() {
		return Utils.waitForElementPresence(driver, By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"), 30);
	}	                                                 
	
	public WebElement getCreatAccountEmailField() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"user_email\"]"), 30);     
	}
	
	public WebElement getCreateAccountBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"new_user\"]/div[5]/div/div/input"), 30);  
	}
	
	public WebElement getAccountBack() {
		return Utils.waitToBeClickable(driver, By.xpath("/html/body/div[2]/div[2]/div[3]/div/a[2]"), 30);
	}                                                    
			
	public WebElement getAccountBackTwo() {
		return Utils.waitToBeClickable(driver, By.xpath(" /html/body/div[2]/div[3]/div/a[2]"), 30);
	}
	
}
