package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------Obj Repo----------------
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement shopping_cart_link;
	
	
	//----------- ACtion methods ------------
	public void clickOnShoppingCartLink()
	{
		shopping_cart_link.click();
	}
	
	
}
