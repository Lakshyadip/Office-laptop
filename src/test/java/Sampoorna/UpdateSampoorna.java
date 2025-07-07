package Sampoorna;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class UpdateSampoorna {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://hrms.kisna.com/Login");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("employeeId")).sendKeys("7855");
		driver.findElement(By.id("passwordField")).sendKeys("Dipak@44");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		//Sampoorna
		driver.findElement(By.xpath("//span[normalize-space()='Sampoorna']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='My Sampoorna']")).click();
	    new Select(driver.findElement(By.xpath("//select[@placeholder='All']"))).selectByVisibleText("Daily");
		
		
		
		
	}

}
