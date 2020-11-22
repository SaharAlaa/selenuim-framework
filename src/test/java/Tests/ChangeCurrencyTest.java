package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;



public class ChangeCurrencyTest extends TestBase{

	HomePage HomePageObject;
	
	
	
	@Test
	public void UserCanChangeCurrencySuccessfully() {
		
		HomePageObject=new HomePage(driver);
		HomePageObject.ChangeCurrency();
		System.out.println(HomePageObject.checkCurrencyElement.getText());
		Assert.assertTrue(HomePageObject.checkCurrencyElement.getText().contains("€"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
