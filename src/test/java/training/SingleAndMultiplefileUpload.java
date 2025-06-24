package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleAndMultiplefileUpload {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Admin\\Downloads\\file_example_XLS_50.xls");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("file_example_XLS_50.xls")) {
			System.out.println("File uploaded succesfully");
		}
		else {
			System.out.println("File failed");
		}
		*/
		
		//multiple file upload
		String file1="C:\\Users\\Admin\\Downloads\\file_example_XLS_50.xls";
		String file2="C:\\Users\\Admin\\Downloads\\file_example_XLS_10.xls";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int nooffiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(nooffiles==2) {
			System.out.println("All files are uploaded");
		}
		else {
			System.out.println("files are failed");
		}
	}

}
