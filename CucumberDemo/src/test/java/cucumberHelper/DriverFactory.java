package cucumberHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.ReadConfig;

public class DriverFactory {

	private WebDriver driver;
	private ReadConfig readConfig;
	private String browser_name;
	
	public DriverFactory()
	{
		readConfig = new ReadConfig();
		browser_name = readConfig.getBrowserName();
	}
	
	private WebDriver createDriver()
	{
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser_name.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browser_name.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		return driver;
	}
	
	public WebDriver getDriver() {
		
		if(driver==null)
		{
			driver = createDriver();
		}
		return driver;
	}
}
