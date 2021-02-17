package seleniumautomation.com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumautomation.com.pageObject.CreateAccount;
import seleniumautomation.com.pageObject.CreateAccountForm;
import seleniumautomation.com.pageObject.Homepage;


public class CreateAccountFormTest {

	private WebDriver driver;
	private Homepage homepage;
	private CreateAccount createAccount;
	private CreateAccountForm createAccountForm;
 	
	@Given ("Accessing the application")
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\RAFAEL\\MyDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		homepage = new Homepage(driver);
		createAccount = new CreateAccount(driver);
		createAccountForm = new CreateAccountForm(driver);
		String baseUrl = "https://automacaocombatista.herokuapp.com/home/index";
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@When ("I register my data")
	public void authenticationPage() {
		homepage.getSignInBtn().click();
		Assert.assertTrue(createAccount.getCreateAccountForm().isDisplayed());
		createAccount.getCreateAccountForm().click();
		Assert.assertTrue(createAccount.getCreatAccountUserField().isDisplayed());
		createAccount.getCreatAccountUserField().click();
		Assert.assertTrue(createAccount.getCreateAccountBtn().isDisplayed());
	}

	
	@Then ("I should be successful in registering a user")
	public void createAccountSuccessfully() {
		createAccountForm.setFirstNameField("Rafael");	
		Assert.assertTrue(createAccountForm.getFirstNameField().isDisplayed());
		createAccountForm.setLastNameField("Pereira");
		Assert.assertTrue(createAccountForm.getLastNameField().isDisplayed());
		createAccountForm.setEmailField("teste@email.com.br");
		Assert.assertTrue(createAccountForm.getEmailField().isDisplayed());
		createAccountForm.setAddressField("Av. Central, 1200 apt.708");
		createAccountForm.setUniversityField("PUC");
		createAccountForm.setProfessionField("Dentista");
		createAccountForm.setGenderField("Masculino");
		createAccountForm.setAgeField("38");
		createAccountForm.getRegisterBtn().click();
		
			
		
		
		Assert.assertTrue(createAccountForm.successfullyCreatedAccount().isDisplayed());
		
	}
	
	@And("The page should be finished")
	public void the_page_should_be_finished() {
		createAccount.getAccountBack().click();
		createAccount.getAccountBackTwo().click();
		driver.quit();
	   // throw new io.cucumber.java.PendingException();
	}
}
