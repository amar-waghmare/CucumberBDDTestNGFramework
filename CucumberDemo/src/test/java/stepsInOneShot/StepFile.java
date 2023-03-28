package stepsInOneShot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumberHelper.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.RegisterPage;
import stepDefinitions.PageObjectManager;

public class StepFile {

	WebDriver driver;
	PageObjectManager pageObjectManager;
	private HomePage homepage_obj;
	private LoginPage loginpage_obj;
	private RegisterPage registerpage_obj;
	
	DriverFactory driverfactory;
	
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		driverfactory = new DriverFactory();
		driver = driverfactory.getDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pageObjectManager = new PageObjectManager(driver);
		
		homepage_obj = pageObjectManager.getHomePage();
		loginpage_obj = pageObjectManager.getLoginPage();
		registerpage_obj = pageObjectManager.getRegisterPage();
	}

	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnRegisterLink();
	}
	
	@When("Clicked on login button")
	public void clicked_on_login_button() {
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnLoginLink();
	}
	
	@Then("user navigates to Register Account")
	public void user_navigates_to_register_account() {
		Assert.assertEquals(driver.getTitle(), "Register Account");
	}
	
	@When("user enter firstname and lastname and email and password and check marked Privacy Policy and clicked on continue")
	public void user_enter_firstname_and_lastname_and_email_and_password_and_check_marked_privacy_policy_and_clicked_on_continue(DataTable dataTable) {
	    
		List<List<String>> userdetail = dataTable.asLists();
		
		registerpage_obj.enterFirstName(userdetail.get(0).get(0));
		registerpage_obj.enterLastName(userdetail.get(0).get(1));
		registerpage_obj.enterEmail(userdetail.get(0).get(2));
		registerpage_obj.enterPassword(userdetail.get(0).get(3));
		registerpage_obj.clickOnPrivacyCheckbox();
		registerpage_obj.clickOnContinueButton();
		
	}
	
	@Then("account created successfully and shows {string}")
	public void account_created_successfully_and_shows(String status_msg) {
	    
		Assert.assertEquals(driver.getTitle(), status_msg );
	}

	
	@Then("account not created and showing user already have account")
	public void account_not_created_and_showing_user_already_have_account() {
	    
		Assert.assertEquals(driver.getTitle(), "Register Account");
	}
	
	@Then("user navigates to account login")
	public void user_navigates_to_account_login() {
	    Assert.assertEquals(driver.getTitle(), "Account Login");
	}

	@When("User enter email as {string} and password as {string} and clicked on login")
	public void user_enter_email_as_and_password_as_and_clicked_on_login(String email, String password) {
		loginpage_obj.enterEmailAddress(email);
		loginpage_obj.enterPassword(password);
		loginpage_obj.clickOnLoginButton();
	}
	
	@Then("logged in sucessfully")
	public void logged_in_sucessfully() {
	   Assert.assertEquals(driver.getTitle(), "My Account");
	}
	
	@Then("not logged in as user details are not available")
	public void not_logged_in_as_user_details_are_not_available() {
	    Assert.assertEquals(driver.getTitle(), "Account Login");
	}
}
