package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportManager implements ITestListener {
	
	
	public ExtentSparkReporter sparkReporter;   //UI of the page
	public ExtentReports extent;     //populate common info on the report
	public ExtentTest test;   //creating test case entries in the report and update status of the test method
	
	public void OnStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myReport.html"); //specify location of the report
		 
		sparkReporter.config().setDocumentTitle("Automation Report");   //Title report
		sparkReporter.config().setReportName("Fuctional Report");      //name of report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "Local Host");
		extent.setSystemInfo("Environment", "Qa");
		extent.setSystemInfo("Tester Name", "Dipak");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Browser Name", "Chrome");
		
		}
	
	public void onTestSuccess(ITestResult result) {
		
		test=extent.createTest(result.getName()); //Create a new entry in report
		test.log(Status.PASS, "Test Case PASSED is:" +result.getName());
	    
		 
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 
		test=extent.createTest(result.getName()); //Create a new entry in report
		test.log(Status.FAIL, "Test Case Failed is;" + result.getName());
		test.log(Status.FAIL, "Test Case Failed cause is:" +result.getThrowable());

		   
		  }
	  
	 public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName()); //Create a new entry in report
		test.log(Status.SKIP, "Test case Skipped is:" +result.getName());

		  }
	 
	 public void onFinish(ITestContext context) {
		 
		 extent.flush();
		    
		  }

}
