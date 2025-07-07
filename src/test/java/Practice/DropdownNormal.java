package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownNormal {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement contry1=driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select county = new Select(contry1);
		county.selectByVisibleText("India");
		//county.selectByValue("india");
		//county.selectByIndex(2);
		
		//2nd capture count
		List<WebElement> options=county.getOptions();
		System.out.println(options.size());
		
		//3rd printing option in consol
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
		
		
		
	}

}
