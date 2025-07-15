package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	
	WebDriver driver;
	
	//constructor
	LoginTest(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Locator

@FindBy(xpath="//input[@placeholder='Password']") WebElement username;
@FindBy(xpath="//input[@placeholder='Username']") WebElement password;
@FindBy(xpath="//button[normalize-space()='Login']") WebElement login;
	
	//Action
      public void setusername(String user) {
    	  username.sendKeys(user);
      }
      
      public void setpassword(String pass) {
    	  password.sendKeys(pass);
      }
      
      public void submit() {
    	  login.click();
      }

	

}
