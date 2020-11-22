package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EmailFriendPage;
import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.ProductDetailsPage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;
import Pages.UserSerachPage;

public class EmailFriendTest extends TestBase {

	
	MyAccountPage myAccountPageObject;
	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
	UserLoginPage LoginObject ;
	UserSerachPage SearchProductObject;
	ProductDetailsPage productDetailsObject;
	EmailFriendPage emailFriendPageObject;
	String OldPassWord="123456789";
	String NewPassWord="123456";
	String email="sahsars1@gmail.com";
	String ProductName="mac";
	String friendEmailString="sahaar@gmail.com";
	String personalMassageString="ajshjhgsjuagdjgajd";
	
	
	//user should register 
	@Test(priority = 1)
	public void UserCanRegisterSuccessflly() {


		homePageObject =new HomePage(driver);

		homePageObject.openRegisterationPage(driver);

		RegisterationObject = new UserRegisterationPage(driver);

		RegisterationObject.userRegisteration("sahar", "alaa", email, OldPassWord);

		Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Your registration completed"));
	}
	 
	//user search about product
	
	@Test(priority = 2)
	public void userCanSearchUsingAutoSugesst() {
		
		SearchProductObject =new UserSerachPage(driver);
		SearchProductObject.ProductSearchUsingAutoSuggest(ProductName);
		SearchProductObject.openEmailFriendPage();
		
	}
	
	@Test(priority = 3)
	public void UserCanEmailAfreinSuccessfully() {
		
		emailFriendPageObject=new EmailFriendPage(driver);
		
		emailFriendPageObject.SendEmailToFriend(friendEmailString, personalMassageString);
		
		Assert.assertTrue(emailFriendPageObject.sucessMassagElement.getText().contains("Your message has been sent"));
		
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
