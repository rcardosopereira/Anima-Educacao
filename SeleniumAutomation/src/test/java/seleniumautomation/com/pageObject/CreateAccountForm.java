package seleniumautomation.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import seleniumautomation.com.utils.Utils;

public class CreateAccountForm {
	
	private WebDriver driver;
	
	public CreateAccountForm(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstNameField() {
		return Utils.waitForElementPresence(driver, By.id("user_name"), 30);
	}
	
	public WebElement getLastNameField() {
		return Utils.waitForElementPresence(driver, By.id("user_lastname"), 30);
	}
	
	public WebElement getEmailField() {
		return Utils.waitForElementPresence(driver, By.id("user_email"), 30);
	}
	
	public WebElement getAddressField() {
		return Utils.waitForElementPresence(driver, By.id("user_address"), 30);
	}
	
	public WebElement getUniversity() {
		return Utils.waitForElementPresence(driver, By.id("user_university"), 30);
	}
	
	public WebElement getProfession() {
		return Utils.waitForElementPresence(driver, By.id("user_profile"), 30);
	}
	
	public WebElement getGenderField() {
		return Utils.waitForElementPresence(driver, By.id("user_gender"), 30);
	}
	
	public WebElement getAgeField() {
		return Utils.waitForElementPresence(driver, By.id("user_age"), 30);
	}
	
	public WebElement getRegisterBtn() {
		return Utils.waitToBeClickable(driver, By.name("commit"), 30);
	}
	
	public WebElement successfullyCreatedAccount() {
		return Utils.waitForElementPresence(driver, By.xpath("//p[contains(text(), \"Usuário Criado com sucesso\")]"), 30);
	}


	public void setFirstNameField(String firstName) {
		WebElement customerFirstNameField = this.getFirstNameField();
		customerFirstNameField.sendKeys(firstName);
	}
	
	public void setLastNameField(String lastName) {
		WebElement customerLastNameField = this.getLastNameField();
		customerLastNameField.sendKeys(lastName);
	}
	
	public void setEmailField(String email) {
		WebElement customerEmailField = this.getEmailField();
		customerEmailField.sendKeys(email);
	}
	
	public void setAddressField(String address) {
		WebElement addressField = this.getAddressField();
		addressField.sendKeys(address);
	}
	
	public void setUniversityField(String university) {
		WebElement universityField = this.getUniversity();
		universityField.sendKeys(university);
	}
	
	public void setProfessionField(String profession) {
		WebElement professionField = this.getProfession();
		professionField.sendKeys(profession);
	}
	
	public void setGenderField(String gender) {
		WebElement genderField = this.getGenderField();
		genderField.sendKeys(gender);
	}
	
	public void setAgeField(String age) {
		WebElement ageField = this.getAgeField();
		ageField.sendKeys(age);
	}
}
