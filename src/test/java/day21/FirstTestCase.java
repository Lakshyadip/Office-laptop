package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equals("Your Store"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		//driver.close();
		driver.quit();
		
	}

}
