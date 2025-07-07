package training;

import java.time.Duration;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	static void futuredate(WebDriver driver,String year, String month, String day) {
		while(true) {
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(currentyear.equals(year) && currentmonth.equals(month)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(day)) {
				dt.click();
				break;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("14/06/2025");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
	    futuredate(driver,"2026","May","5");
		
		
		
		
		
		
		
	}

}
