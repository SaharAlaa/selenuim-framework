package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.UserSerachPage;

public class SearchProductTest  extends TestBase {

	HomePage HomePageObject;
	UserSerachPage SearchProductObject;
	ProductDetailsPage productDetailsObject;
	String ProductName="mac";

	@Test
	public void UserCanSearchSucessfully() {



		SearchProductObject =new UserSerachPage(driver);
		SearchProductObject.ProductSearch(ProductName);
		Assert.assertTrue(SearchProductObject.productElement.getText().contains("Apple MacBook Pro 13-inch"));
		SearchProductObject.OpenProductDetails();
		productDetailsObject=new ProductDetailsPage(driver);
		Assert.assertTrue(productDetailsObject.productDeatailsElement.getText().contains("Apple MacBook Pro 13-inch"));

	}


















}
