package Tests;

import org.testng.annotations.Test;


import Pages.ProductDetailsPage;
import Pages.UserSerachPage;

public class SearchProductUsingAutoSuggestTest extends TestBase{

	
	UserSerachPage SearchProductObject;
	ProductDetailsPage productDetailsObject;
	String ProductName="mac";
	@Test
	public void userCanSearchUsingAutoSugesst() {
		
		SearchProductObject =new UserSerachPage(driver);
		SearchProductObject.ProductSearchUsingAutoSuggest(ProductName);
	}
	
	
	
	
	
}
