package Tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ShopingCartPage;
import Pages.UserSerachPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AddProductToShopingCartTest  extends TestBase{
	
	HomePage homePageObject;
 	UserSerachPage SearchProductObject;
	ProductDetailsPage productDetailsObject;
	ShopingCartPage shopingCartObjectCartPage;
	String ProductName="mac";
	
	@Test(priority = 1)
	public void userCanSearchUsingAutoSugesst() {
		
		SearchProductObject =new UserSerachPage(driver);
		SearchProductObject.ProductSearchUsingAutoSuggest(ProductName);
		productDetailsObject=new ProductDetailsPage(driver);
		Assert.assertTrue(productDetailsObject.addToCardBtnElement.getText().contains("Add to cart"));
	}
	


  @Test(priority = 2)
  @Severity(SeverityLevel.MINOR)
  @Description("user can add product ")
  public void UserCanAddProductToShoppingCard() {
	  Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
	  
	  productDetailsObject=new 	ProductDetailsPage(driver);
	  productDetailsObject.AddTOCart();
	   System.out.println("adssdsd");
	 
  }
  
  
  @Test(priority = 3)
  public void UserCanUpdateShoppingCartSucessfully() {
	  
	  productDetailsObject.OpenShoppingCart();
	  shopingCartObjectCartPage=new ShopingCartPage(driver);
	  shopingCartObjectCartPage.UpdateProductToCart("3");
	  shopingCartObjectCartPage.continueShopping();
	  
	  
	  throw new SkipException("skip this test ");
	  
	  
	  
}


}
