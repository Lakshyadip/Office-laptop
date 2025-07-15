package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMS {
	
	
	WebDriver driver;
	
	@Test(priority=1)
	void openapplication() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test(priority=3)
	void logodisplayed() {
		boolean logo=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		System.out.println("logo displayed"+logo);
	}
	
	@Test(priority=4)
	void logout() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		driver.quit();
		
	}
	
	
  
}
