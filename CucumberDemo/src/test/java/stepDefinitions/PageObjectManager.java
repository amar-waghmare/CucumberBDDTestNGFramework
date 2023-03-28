package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.RegisterPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homepage_obj;
	private LoginPage loginpage_obj;
	private RegisterPage registerpage_obj;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage getHomePage()
	{
		homepage_obj = new HomePage(driver);
		return homepage_obj;
	}
	
	public LoginPage getLoginPage()
	{
		loginpage_obj = new LoginPage(driver);
		return loginpage_obj;
	}
	
	public RegisterPage getRegisterPage()
	{
		registerpage_obj = new RegisterPage(driver);
		return registerpage_obj;
	}

}
