package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	
public static WebDriver driver;
	
	public static WebDriver browsersetup()
	{
	
	       //open chrome browser 
			System.setProperty("webdriver.chrome.driver", "C:\\alljava\\Projects\\bestbuyca_hybrid\\digitalpoint\\Drivers\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			
			//open firefox  browser 
			//System.setProperty("webdriver.gecko.driver", "C:\\DevOPs1\\MyProject\\Nov02\\digitalpoint.tech\\drivers\\geckodriver.exe");
			
			//driver= new FirefoxDriver();
			
			
			// Maximize the browser 
			driver.manage().window().maximize();
			//delete all cookies 
			driver.manage().deleteAllCookies();
			
           return driver; 
}
}
