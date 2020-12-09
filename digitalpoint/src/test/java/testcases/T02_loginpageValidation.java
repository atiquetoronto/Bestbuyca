package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.elementLocators;
import utilities.userData;

public class T02_loginpageValidation {
	public static WebDriver driver;
	
	@BeforeMethod (groups= {"regression"})

		
		public static void openBrowser()
		
		{
			driver=browserEngine.browsersetup();
					
		}



	@Test (groups= {"regression"})

	public static void logpagevalidation() throws InterruptedException

	{
		//loading the application under test 
		driver.get(userData.appURL);
		
		// validation of login page title 
		
		
				
				String loginpageactutaltitle= driver.getTitle();
				
				AssertJUnit.assertEquals(loginpageactutaltitle, userData.loginpageexpectedtitle);
				
				//login functionality validation 
				
				// sending value to the name box 
				
				driver.findElement(elementLocators.loginPage_email).sendKeys(userData.uid);
				
				// sending value to the passoword box 
				driver.findElement(elementLocators.loginPage_password).sendKeys(userData.pw);
				
				//click on signin button 
				
				driver.findElement(elementLocators.loginPage_loginBtn).click();
				
				Thread.sleep(3000);
				
				//logout functionality validation 
				
				driver.findElement(elementLocators.loginpage_logoutdtopBtn).click();
				driver.findElement(elementLocators.loginpage_logoutBtn).click();
				
				
		
		
	}


	@AfterMethod (groups= {"regression"})
	public static void closeBrwoser()

	{
		//closing the browser
		//driver.close();
		
	}
}
