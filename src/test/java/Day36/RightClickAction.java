package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		act.contextClick(right).build().perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		driver.switchTo().alert().accept();
		
		
		 
		
	}

}
