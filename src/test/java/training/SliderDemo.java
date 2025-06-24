package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Location of min Locator:"+min_slider.getLocation());
		act.dragAndDropBy(min_slider, 100, 249).build().perform();
		System.out.println("Location of min locator after element sliding:"+min_slider.getLocation());
		
		//max character
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of max slider:"+max_slider.getLocation());
		act.dragAndDropBy(max_slider, -100, 249).build().perform();
		System.out.println("Location of max slider after element sliding:"+max_slider.getLocation());
		
		
		
		
	}

}
