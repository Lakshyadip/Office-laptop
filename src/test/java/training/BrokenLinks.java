package training;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capture all the element from website
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		int noOfBrokenLinks = 0;
		
		
		//reading each and every link
		for(WebElement linkelement:links) {
			
			String hrefattValue=linkelement.getAttribute("href");
			if(hrefattValue==null || hrefattValue.isEmpty()) {
				System.out.println("href value is null or empty so not possible tocheck");
				continue;
				
				
			}
			//hit url to server
			try {
				URL linkURL = new URL(hrefattValue);//converted href value from string to URL format
				HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection(); //open connection to the 
				conn.connect();// connect to server and send request to server
				
				if(conn.getResponseCode()>=400) {
					System.out.println(hrefattValue+"======>broken link");
					noOfBrokenLinks++;
				}
				else {
					System.out.println(hrefattValue+"Not a broken links");
				}
				
			}
			catch(Exception e) {
				
			}
			
			
		}
		
		
		
		
	}

}
