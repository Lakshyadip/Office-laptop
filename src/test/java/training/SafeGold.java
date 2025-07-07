package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SafeGold {
	
	WebDriver driver;
	
	
	@BeforeClass
	void setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatfranchise.sdaemon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vimannagar");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Vimannagar@123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[normalize-space()='Digital Gold']")).click();
	}
	
	@Test
	void purchasegold() throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='80%'");
		driver.findElement(By.xpath("//div[normalize-space()='Purchase']")).click();
		Actions act = new Actions(driver); 
		driver.findElement(By.xpath("//input[@id='CustomerPhone']")).sendKeys("9112110296");
		//driver.findElement(By.xpath("//input[@id='CustomerPhone']")).click();
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='card']//div[2]//div[2]//input[1]")).sendKeys("5000");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		new Select(driver.findElement(By.xpath("//select[@class='form-control form-control-sm']"))).selectByVisibleText("UPI");
		driver.findElement(By.xpath("//div[3]//div[2]//input[1]")).sendKeys("5000");
		driver.findElement(By.xpath("//div[3]//div[3]//input[1]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//h5[normalize-space()='E-Gold Transaction']")).isDisplayed();
		System.out.println("Purchase Of Digital Gold is Done");
		
	}
	
	@Test
	void sellgold() {
		
	}
	
	@Test()
	void transaction() {
		
	}
	
	@AfterClass()
	void teardown()
	{
		driver.quit();
	}

}
