package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//select single option
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all the element and find out size
	      List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	      System.out.println("number of options"+options.size());
		
		//Printing option from dropdown
		/*for(WebElement op:options) {
			System.out.println(op.getText());
			
		}*/
	
	    //Select multiple option from dropdown
	      
	      for(WebElement op:options) {
	    	  
	    	  String option=op.getText();
		      
		      if(option.equals("Java")||option.equals("Python")) {
		    	  op.click();
		      }
		
	    	  
	      }
	
		
	}

}
