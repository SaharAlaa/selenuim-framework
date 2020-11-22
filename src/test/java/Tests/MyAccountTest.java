package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;

public class MyAccountTest extends TestBase {


	MyAccountPage myAccountPageObject;
	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
	UserLoginPage LoginObject ;
	String OldPassWord="123456789";
	String NewPassWord="123456";
	String email="sahaar1@gmail.com";



	@Test(priority = 1)
	public void UserCanRegisterSuccessflly() {


		homePageObject =new HomePage(driver);

		homePageObject.openRegisterationPage(driver);

		RegisterationObject = new UserRegisterationPage(driver);

		RegisterationObject.userRegisteration("sahar", "alaa", email, OldPassWord);

		Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Your registration completed"));
	}


	@Test(dependsOnMethods = ("UserCanRegisterSuccessflly"), priority = 2)
	public void UserCanChangePassWordSucessfully() {

		RegisterationObject=new UserRegisterationPage(driver);
		RegisterationObject.openMyAccountPage(driver);

		myAccountPageObject=new MyAccountPage(driver);
		myAccountPageObject.OpenChangePassWordPage();

		myAccountPageObject.UserChangePassword(OldPassWord,NewPassWord);


		Assert.assertTrue(myAccountPageObject.resultLbElement.getText().contains("Password was changed"));
	}
	
	@Test(dependsOnMethods = ("UserCanChangePassWordSucessfully"), priority = 3)
	public void UserCanLogOutSuccessfully() {

		RegisterationObject.userLogOut();

	}
	
	@Test(priority = 4)
	public void RegisteredUserCanLogOutSuccessfully() {
		homePageObject =new HomePage(driver);
		LoginObject= new UserLoginPage(driver);

		homePageObject.openLoginPage(driver);
		LoginObject.userLogin(email,NewPassWord);
		Assert.assertTrue(RegisterationObject.logOutElement.isDisplayed());
	}















}
