package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------Obj Repo----------------
	@FindBy(xpath="(//img[@class='img-responsive'])[2]")
	private WebElement productName_link;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement add_to_cart_btn;
	
	//----------- ACtion methods ------------
	public void clickOnProduct()
	{
		productName_link.click();
	}
	
	public void clickOnAddToCart()
	{
		add_to_cart_btn.click();
	}
	
	
}
