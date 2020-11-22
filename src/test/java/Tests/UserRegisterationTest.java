package Tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;

public class UserRegisterationTest extends TestBase {

	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
	UserLoginPage LoginObject ;
    

	@Test(priority = 1 ,alwaysRun = true)
	public void UserCanRegisterSuccessflly() {


		homePageObject =new HomePage(driver);



		homePageObject.openRegisterationPage(driver);


		RegisterationObject = new UserRegisterationPage(driver);


		RegisterationObject.userRegisteration("sahar", "alaa", "saha4@gmail.com", "123456789");

		Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Your registration completed"));
	}

	  @Test(dependsOnMethods = ("UserCanRegisterSuccessflly"))
      public void UserCanLogOutSuccessfully() {
		
		  RegisterationObject.userLogOut();
		
	}
	  @Test(dependsOnMethods = ("UserCanLogOutSuccessfully"))
	  public void RegisteredUserCanLogOutSuccessfully() {
		  homePageObject =new HomePage(driver);
		  LoginObject= new UserLoginPage(driver);
		  
		  homePageObject.openLoginPage(driver);
		  LoginObject.userLogin("saha4@gmail.com", "123456789");
	    Assert.assertTrue(RegisterationObject.logOutElement.isDisplayed());
	  }
	  
	


}
