package training;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DragAndDropDemo {
	
	static void futuredate(WebDriver driver,String day) {
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(day)) {
				dt.click();
				//break();
			}
		}
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='product_551']")).click();
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Lakshyadip");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Kamble");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select mon = new Select(month);
		mon.selectByVisibleText("Oct");
		
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select yea = new Select(year);
		yea.selectByValue("1998");
		
		driver.findElement(By.xpath("//select[@aria-label='Select month']")).click();
		
		futuredate(driver,"15");
		
		driver.findElement(By.xpath("//input[@id='sex_1']")).click();
		
		driver.findElement(By.xpath("//input[@id='traveltype_1']")).click();
		
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Delhi");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
