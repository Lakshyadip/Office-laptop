package training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Training1 {
	
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training.kisna.com/");
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.xpath("//a[text()='Back Office Login']")).click();
        new Select(driver.findElement(By.id("DeptID"))).selectByVisibleText("IT");
        driver.findElement(By.id("SurveyGName")).sendKeys("Dipak");
        driver.findElement(By.id("SurveyGMobile")).sendKeys("9112110296");
        driver.findElement(By.xpath("//button[text()='Continue']")).click();

        // Start quiz
        new Select(driver.findElement(By.id("quiz"))).selectByIndex(1);
        driver.findElement(By.id("start_quiz")).click();

        // Answer 24 questions
        for (int i = 1; i <= 24; i++) {
            WebElement option = mywait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@onclick='optionSelected(this)'][2]")));
            option.click();

            WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
            nextButton.click();
        }

        // Answer last question and submit
        WebElement lastOption = mywait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@onclick='optionSelected(this)'][2]")));
        lastOption.click();

        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitButton.click();

        driver.quit();
        System.out.println("Quiz is completed");
    }
}


