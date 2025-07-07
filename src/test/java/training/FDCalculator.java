package training;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		try {
		    WebElement cancelButton = driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
		    if (cancelButton.isDisplayed()) {
		        cancelButton.click(); // better than driver.close()
		        System.out.println("Push notification appeared and was closed.");
		    }
		} catch (NoSuchElementException e) {
		    System.out.println("Push notification did not appear.");
		}

	    String filePath=System.getProperty("user.dir")+"\\TestData\\Test Data.xlsx";
		int rows=ExcelUtile.getRowCount(filePath,"Sheet1");
		
		for(int i=1;i<=rows;i++) {
			
			//1) Read data from Excel
			String prin=ExcelUtile.getCellData(filePath, "Sheet1", i, 0);
			String roi=ExcelUtile.getCellData(filePath, "Sheet1", i, 1);
			String period1=ExcelUtile.getCellData(filePath, "Sheet1", i, 2);
			String period2=ExcelUtile.getCellData(filePath, "Sheet1", i, 3);
			String frequency=ExcelUtile.getCellData(filePath, "Sheet1", i, 4);
			String expec_value=ExcelUtile.getCellData(filePath, "Sheet1", i, 5);
			
			//2) Pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(prin);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			Select predrp= new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			predrp.selectByVisibleText(period2);
			Select fre = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fre.selectByVisibleText(frequency);
			driver.findElement(By.xpath("//form[@id='fdMatVal']//a[1]")).click();
			
			//3) validation
			String act_value=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(expec_value)==Double.parseDouble(act_value)) {
				System.out.println("Test is Passed");
				ExcelUtile.setCellData(filePath,"Sheet1",i,7,"Passed");
				ExcelUtile.fillGreenColor(filePath,"Sheet1",i,7);
				
			}
			else {
				System.out.println("Test is Failed");
				ExcelUtile.setCellData(filePath,"Sheet1",i,7,"Failed");
				ExcelUtile.fillRedColor(filePath,"Sheet1",i,7);
				
			}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
		}
		driver.quit();
		
		
	}

}
