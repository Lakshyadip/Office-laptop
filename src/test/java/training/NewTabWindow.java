package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabWindow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://uatfranchise.sdaemon.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://uatcdb.sdaemon.com/");
		
		//driver.switchTo().
		
		
		
	}

}
