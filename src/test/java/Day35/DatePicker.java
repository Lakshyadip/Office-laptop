package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");;
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		//using sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/11/2025");
		
		//using datepicker
		//expected data
		String year="2026";
		String month ="June";
		String day="13";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month/year
		while(true) {
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(currentyear.equals(year) && currentmonth.equals(month)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		
		
		
	}

}
