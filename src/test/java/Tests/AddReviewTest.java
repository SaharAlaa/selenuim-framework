package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ProductReviewPage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;
import Pages.UserSerachPage;

public class AddReviewTest extends TestBase{

	/*
	 * 1-user register
	 * 2-user search
	 * 3-add review
	 * 4-logout
	 * */
	
	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
	UserLoginPage LoginObject ;
	UserSerachPage SearchProductObject;
	ProductDetailsPage productDetailsObject;
	ProductReviewPage productReviewObject;
	
	String ProductName="mac";


	@Test(priority = 1 )
	public void UserCanRegisterSuccessflly() {


		homePageObject =new HomePage(driver);

		homePageObject.openRegisterationPage(driver);

		RegisterationObject = new UserRegisterationPage(driver);

		RegisterationObject.userRegisteration("sahar", "alaa", "sadaahjlls4a@gmail.com", "123456789");

		Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Your registration completed"));
	}
	
	@Test(priority = 2)
	public void userCanSearchUsingAutoSugesst() {
		
		SearchProductObject =new UserSerachPage(driver);
		SearchProductObject.ProductSearchUsingAutoSuggest(ProductName);
	}
	
	
	
	@Test(priority = 3)
	public void UserCanAddReviewSucessfully() {
		productDetailsObject=new ProductDetailsPage(driver);
		productDetailsObject.OpenAddReviewPage();
		productReviewObject=new  ProductReviewPage(driver);
		productReviewObject.AddRpductReview("jshadjhgsd","adgshgdh");	
		Assert.assertTrue(productReviewObject.AddReviewSucessMassage.getText().contains("Product review is successfully"));
		productReviewObject.LogOut();
		
	}
	
	
	
	
	
	
	
	
	
}
