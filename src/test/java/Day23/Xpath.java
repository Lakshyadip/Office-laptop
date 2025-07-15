package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Lakshyadip");
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Lakshyadip@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
	}

}
