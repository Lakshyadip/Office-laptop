package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatfranchise.sdaemon.com/");
		driver.manage().window().maximize();
		
		
		
		//Login
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vimannagar");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Vimannagar@123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		
		//
		driver.findElement(By.xpath("//div[@data-i18n='Front Pages'][normalize-space()='Transaction']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sales Entry List')]")).click();
		driver.findElement(By.cssSelector("input[placeholder='Start End..']")).click();
		
		
		
		
	}

}
