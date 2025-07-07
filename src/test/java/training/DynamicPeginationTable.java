package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicPeginationTable {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://uatfranchise.sdaemon.com/Login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("Vimannagar");
		
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.clear();
		password.sendKeys("Vimannagar@123");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Product Inventory']")).click();
		driver.findElement(By.xpath("//div[text()='Diamond Product Inventory']")).click();
		
		//String style=driver.findElement(By.xpath("//table[@id='DataTables_Table_0']//tr[3]//td[6]")).getText();
		//System.out.println(style);
		
	    WebElement page1=driver.findElement(By.xpath("//select[@class='form-control form-control-sm mx-2 select-pagination']"));
		Select page = new Select(page1);
		page.selectByValue("100");
		
		/*for(int p=1;p<=page;p++) {
			if(p>1) {
				WebElement active_page=driver.findElement(By.xpath("li[class='page-item active'] a[class='page-link'][+p+]"));
				active_page.click();
			}
		}*/
		
		
		
		
		
		
		
		
		
	}

}
