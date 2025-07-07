package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argrument[0].setAttribute('value','Lakshyadip')",name);
		
		WebElement men=driver.findElement(By.xpath("//input[@id='male']"));
		//js.executeScript("argrument[0].click()", men);
		
		}

	

	
}
