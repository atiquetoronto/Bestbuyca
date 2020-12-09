package utilities;

import org.openqa.selenium.By;

public class elementLocators {
	
  //Login Page Locators
  	public static By loginPage_email = By.name("username");
  	public static By loginPage_password = By.name("password");
  	
  	public static By loginPage_loginBtn = By.xpath("//*[@id=\"signIn\"]/div/button/span");
          
                                                           
          public static By loginpage_logoutdtopBtn =By.xpath("//*[@id=\"root\"]/div/header/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/a/span[2]/svg");
          public static By loginpage_logoutBtn=By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/button/span");
        
    
}
