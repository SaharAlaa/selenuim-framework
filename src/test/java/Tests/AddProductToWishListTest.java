package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductDetailsPage;
import Pages.UserSerachPage;
import Pages.WishListPage;

public class AddProductToWishListTest extends TestBase {
	
	
	
	
	UserSerachPage SearchProductObject;
	ProductDetailsPage productDetailsObject;
	WishListPage wishListPageObject;
	String ProductName="mac";
	
	
	@Test(priority = 1)
	public void userCanSearchUsingAutoSugesst() {
		
		SearchProductObject =new UserSerachPage(driver);
		SearchProductObject.ProductSearchUsingAutoSuggest(ProductName);
	}
	
	@Test(priority = 2)
	public void UserCanAddProductToWishList() {
		 productDetailsObject=new ProductDetailsPage(driver);
		 productDetailsObject.AddProductToWishListPage();
		 productDetailsObject.OpenWishListPage();
		 wishListPageObject=new WishListPage(driver);
		 
		 Assert.assertTrue(wishListPageObject.assertMassElement.getText().contains("Wishlist"));
		 
		 
          wishListPageObject.RemoveProductFromWishList();
	  Assert.assertTrue(wishListPageObject.emptyassertionMassageeElement.getText().contains("The wishlist is empty"));
		
	
	}
	

}
