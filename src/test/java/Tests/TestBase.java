package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Utilities.Helper;



public class TestBase  {

	public static WebDriver driver;
	

	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver (@Optional("chrome") String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HPXX03\\eclipse-workspace\\seleium\\drivers\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HPXX03\\eclipse-workspace\\seleium\\drivers\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");
		

	}

	@AfterSuite
	public void stopDriver() {

	//	driver.close();
	}
	
	
	@AfterMethod
	public void screenShotOnFailure(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			
			System.out.println("Fail!!!!");
			System.out.println("Taking ScreenShots .........");
			Helper.CaptureScreenShot(driver,result.getName() );
			
		}
		
		
		
	}
	

}
