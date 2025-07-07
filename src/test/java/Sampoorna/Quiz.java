package Sampoorna;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Quiz {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		
	}
	
	@Test(dataProvider="dp")
	void testlogin(String name, String mobnum) throws InterruptedException {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training.kisna.com/");
        driver.manage().window().maximize();
        //Thread.sleep(10000);
        JavascriptExecutor js =(JavascriptExecutor)driver;
        

        // Login
        driver.findElement(By.xpath("//a[text()='Back Office Login']")).click();
        new Select(driver.findElement(By.id("DeptID"))).selectByVisibleText("IT");
        driver.findElement(By.id("SurveyGName")).sendKeys("name");
        driver.findElement(By.id("SurveyGMobile")).sendKeys("mobnum");
        driver.findElement(By.xpath("//button[text()='Continue']")).click();

        // Start quiz
        new Select(driver.findElement(By.id("quiz"))).selectByIndex(1);
        driver.findElement(By.id("start_quiz")).click();

        
		// Answer 24 questions
        for (int i = 1; i <= 24; i++) {
        	js.executeScript("document.body.style.zoom='80%'");
            WebElement option = mywait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@onclick='optionSelected(this)'][2]")));
            option.click();
            Thread.sleep(5000);
            WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
            nextButton.click();
            Thread.sleep(2000);
        }

        // Answer last question and submit
        js.executeScript("document.body.style.zoom='80%'");
        WebElement lastOption = mywait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@onclick='optionSelected(this)'][2]")));
        lastOption.click();
        Thread.sleep(5000);

        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitButton.click();
        Thread.sleep(2000);
		
	}
	
	
	@AfterClass
	void teardown() {
		driver.quit();
        System.out.println("Quiz is completed");
	}
	
	@DataProvider(name="dp")
	Object[][] loginData(){
		
		Object data [][]= {{"Dipak","9112110296"},
		                   {"devendra dharwar","9713894681"},
		                   {"Deepali Gholekar","9545210443"},
		                   {"Arshdeep Singh","9503213906"},
		                   {"Parag Haria","9867084201"},
		                   {"Pradeep Giri","9167400861"},
		                   
		                   
		                                    
		};
		return data;
		}
		
		
	}
	
	
	
	
	


