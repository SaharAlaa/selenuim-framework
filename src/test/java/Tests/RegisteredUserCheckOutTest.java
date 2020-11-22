package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CheckOutPage;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ShopingCartPage;
import Pages.UserRegisterationPage;
import Pages.UserSerachPage;

public class RegisteredUserCheckOutTest extends TestBase {
	
	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
 	UserSerachPage SearchProductObject;
	ProductDetailsPage productDetailsObject;
	ShopingCartPage shopingCartObjectCartPage;
	CheckOutPage checkOutPageObject;
	String ProductName="mac";
	
	
	
	@Test(priority = 1 ,alwaysRun = true)
	public void UserCanRegisterSuccessflly() {


		homePageObject =new HomePage(driver);



		homePageObject.openRegisterationPage(driver);


		RegisterationObject = new UserRegisterationPage(driver);


		RegisterationObject.userRegisteration("sahar", "alaa", "sahvaasxdew4@gmail.com", "123456789");

		Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Your registration completed"));
	}
	
	@Test(priority = 2)
	public void userCanSearchUsingAutoSugesst() {
		
		SearchProductObject =new UserSerachPage(driver);
		SearchProductObject.ProductSearchUsingAutoSuggest(ProductName);
	}
	


  @Test(priority = 3)
  public void UserCanAddProductToShoppingCard() {
	  
	  productDetailsObject=new 	ProductDetailsPage(driver);
	  productDetailsObject.AddTOCart();
	   System.out.println("adssdsd");
	 
  }
  
  
  @Test(priority = 4)
  public void UserCanUpdateShoppingCartSucessfully() {
	  
	  productDetailsObject.OpenShoppingCart();
	  shopingCartObjectCartPage=new ShopingCartPage(driver);
	  shopingCartObjectCartPage.UpdateProductToCart("3");
	  shopingCartObjectCartPage.CheckOut();
	  
}
  
  @Test(priority = 5)
  public void UserCanCheckOutSuccessfully() {
	  
	  checkOutPageObject =new CheckOutPage(driver);
	  checkOutPageObject.RegisteredUserCheckOut("Aruba", "giza", "adskajhd", "1331341", "01321372436");
	  Assert.assertTrue(checkOutPageObject.checkOutSucessMassagElement.getText().contains("Your order has been successfully processed"));
	  
	  
  }

}
