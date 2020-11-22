package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.HomePage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;

public class UserRegisterationUsingValidationAndExtentReports extends TestBase {

	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
	UserLoginPage LoginObject ;

	 ExtentTest test;
	 ExtentReports report;
    

	@Test(priority = 1 )
	public void checkThatEmailAddressShouldBeValidFormate() {


		homePageObject =new HomePage(driver);

		homePageObject.openRegisterationPage(driver);

		RegisterationObject = new UserRegisterationPage(driver);

		RegisterationObject.userRegisteration("sahar", "alaa", "saha4@gmail", "123456789");
		report = new ExtentReports(System.getProperty("user.dir")+"\\IvalidEmail.html");
		test = report.startTest("Check that email address should be valid format ");
		
		
		try {
			Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Wrong email"));
			test.log(LogStatus.PASS, "System validate correctly that email address shloud be valid");
			
			
			
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Test Failed because the email is inavlid");
			//org.testng.Assert.fail("Testcase failed System not validate that email address format or error message not appear");
		}
		
		report.endTest(test);
		report.flush();
	}
	@Test(priority = 2 , dependsOnMethods = ("checkThatEmailAddressShouldBeValidFormate"))
	public void checktheSystemWithInvalidEmailAndPass() {


		homePageObject =new HomePage(driver);

		homePageObject.openRegisterationPage(driver);

		RegisterationObject = new UserRegisterationPage(driver);

		RegisterationObject.userRegisteration("sahar", "alaa", "saha4@gmail", "12");
		report = new ExtentReports(System.getProperty("user.dir")+"\\IvalidEmailAndPass.html");
		test = report.startTest("Check that password should be valid format ");
		
		
		try {
			Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Wrong email"));
			test.log(LogStatus.PASS, "System validate correctly that email address shloud be valid");
			
			
			
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Test Failed because the email is inavlid");
			//org.testng.Assert.fail("Testcase failed System not validate that email address format or error message not appear");
		}
		
		try {
			Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Password must meet the following rules"));
			test.log(LogStatus.PASS, "System validate correctly that password shloud be at least 6 characters");
			
			
			
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Test Failed because the password is invalid");
			
		}
		
		report.endTest(test);
		report.flush();
	}

	 

}
