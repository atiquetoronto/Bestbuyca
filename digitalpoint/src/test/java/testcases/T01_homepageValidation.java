package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.userData;

public class T01_homepageValidation {
	
public static WebDriver driver;
	
	@BeforeMethod(groups={"smoke"})
	
	public static void openBrowser()
	
	{
		driver=browserEngine.browsersetup();
	}

	
	@Test(groups={"smoke"})
	
	public static void homepageValidation()
	
	{
		//load the application under test 
		driver.get(userData.homeURL);
		
		// validate the title of  the home page 
		
		String hpageexpectedtitle = "Best Buy: Shop Online For Deals & Save | Best Buy Canada";
		String hpactutaltitle=driver.getTitle();
		
       AssertJUnit.assertEquals(hpactutaltitle, hpageexpectedtitle);		
	}
	
	@AfterMethod(groups={"smoke"})
	
	public static void closeBrwoser()
	
	{
		//closing the browser
		driver.close();
		
	}

}
