package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Training {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://training.kisna.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Back Office Login']")).click();
		
		Select dep = new Select(driver.findElement(By.id("DeptID")));
		dep.selectByVisibleText("IT");
		
		driver.findElement(By.id("SurveyGName")).sendKeys("devendra dharwar");
		driver.findElement(By.id("SurveyGMobile")).sendKeys("9713894681");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		Select drop = new Select(driver.findElement(By.id("quiz")));
		drop.selectByIndex(1);
		
		driver.findElement(By.id("start_quiz")).click();
		WebElement ckc1=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc1.click();
		Thread.sleep(10000);
	    WebElement next1 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next1.click();
	    WebElement ckc2=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc2.click();
		Thread.sleep(10000);
	    WebElement next2 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next2.click();
	    WebElement ckc3=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc3.click();
		Thread.sleep(10000);
	    WebElement next3 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next3.click();
	    WebElement ckc4=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc4.click();
		Thread.sleep(10000);
	    WebElement next4 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next4.click();
	    WebElement ckc5=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc5.click();
		Thread.sleep(10000);
	    WebElement next5 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next5.click();
	    WebElement ckc6=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc6.click();
		Thread.sleep(10000);
	    WebElement next6 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next6.click();
	    WebElement ckc7=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc7.click();
		Thread.sleep(10000);
	    WebElement next7 = driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]"));
	    next7.click();
	    WebElement ckc8=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc8.click();
		Thread.sleep(10000);
	    WebElement next8= driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next8.click();
	    WebElement ckc9=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc9.click();
		Thread.sleep(10000);
	    WebElement next9 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next9.click();
	    WebElement ckc10=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc10.click();
		Thread.sleep(10000);
	    WebElement next10 = driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]"));
	    next10.click();
	    WebElement ckc11=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc11.click();
		Thread.sleep(10000);
	    WebElement next11 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next11.click();
	    WebElement ckc12=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc12.click();
		Thread.sleep(10000);
	    WebElement next12 = driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]"));
	    next12.click();
	    WebElement ckc13=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc13.click();
		Thread.sleep(10000);
	    WebElement next13 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next13.click();
	    WebElement ckc14=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc14.click();
		Thread.sleep(10000);
	    WebElement next14 = driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]"));
	    next14.click();
	    WebElement ckc15=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc15.click();
		Thread.sleep(10000);
	    WebElement next15 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next15.click();
	    WebElement ckc16=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc16.click();
		Thread.sleep(10000);
	    WebElement next16 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next16.click();
	    WebElement ckc17=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc17.click();
		Thread.sleep(10000);
	    WebElement next17 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next17.click();
	    WebElement ckc18=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc18.click();
		Thread.sleep(10000);
	    WebElement next18 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next18.click();
	    WebElement ckc19=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc19.click();
		Thread.sleep(10000);
	    WebElement next19 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next19.click();
	    WebElement ckc20=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc20.click();
		Thread.sleep(10000);
	    WebElement next20 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next20.click();
	    WebElement ckc21=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc21.click();
		Thread.sleep(10000);
	    WebElement next21 = driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]"));
	    next21.click();
	    WebElement ckc22=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc22.click();
		Thread.sleep(10000);
	    WebElement next22 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next22.click();
	    WebElement ckc23=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc23.click();
		Thread.sleep(10000);
	    WebElement next23 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next23.click();
	    WebElement ckc24=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc24.click();
		Thread.sleep(10000);
	    WebElement next24 = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    next24.click();
	    WebElement ckc25=mywait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='option'])[2]"))));
		ckc25.click();
		Thread.sleep(10000);
	    WebElement next25 = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
	    next25.click();
	    driver.quit();
	    System.out.println("Quiz is completed");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
