package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamTest {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException {
		
		switch(br.toLowerCase()) {
		case "chrome":driver= new ChromeDriver(); break;
		case "firefox":driver=new FirefoxDriver(); break;
		default:System.out.println("Invalid browser");return;
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@Test
	void testlogo() {
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test
	void testtitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test
	void testurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}

}
