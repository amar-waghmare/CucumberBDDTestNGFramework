package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	private String path = "/resources/properties/config.properties";
	private Properties pro ;
	
	public ReadConfig()
	{
		File file = new File(System.getProperty("user.dir")+path);
		try 
		{
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			System.out.println("Check the path of config file");
			e.printStackTrace();
		}
	}
	
	public String getBrowserName()
	{
		String browser_name = pro.getProperty("browser");
		return browser_name;
	}
	
	public String getApplicationUrl()
	{
		String app_url = pro.getProperty("url");
		return app_url;
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = pro.getProperty("implicitlyWait");
		if(implicitlyWait != null) {
			try{
				return Long.parseLong(implicitlyWait);
			}
			catch(NumberFormatException e) 
			{
				throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
			}
		}
		return 30;		
	}
}
