package pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------Obj repo ---------------------
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myaccount_link;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login_link;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement search_txtbox;
	
	//------------ Action methods ----------------
	public void clickOnMyAccountLink()
	{
		myaccount_link.click();
	}
	
	public void clickOnLoginLink()
	{
		login_link.click();
	}
	
	public void clickOnRegisterLink()
	{
		register_link.click();
	}
	
	public void enterProductNameInSearchBox(String productname)
	{
		search_txtbox.sendKeys(productname+Keys.ENTER);
	}


}
