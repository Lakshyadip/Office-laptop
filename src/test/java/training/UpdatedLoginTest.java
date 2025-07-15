package training;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdatedLoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void logintest() {
		LoginTest lt= new LoginTest(driver);
		lt.setusername("Admin");
		lt.setpassword("admin123");
		lt.submit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
		
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
		
	
	

}
