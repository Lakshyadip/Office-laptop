package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandledInCognitoMode {
	
public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		//System.out.println(title);
		if(title.equals("Automation Testing Practice")) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		//driver.quit();
		
		
	
		
	}


}
