package Sampoorna;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateSampoorna {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://hrms.kisna.com/Login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("employeeId")).sendKeys("7855");
		driver.findElement(By.id("passwordField")).sendKeys("Dipak@44");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
