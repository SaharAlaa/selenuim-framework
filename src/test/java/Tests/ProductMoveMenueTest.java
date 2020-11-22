package Tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;

public class ProductMoveMenueTest extends TestBase{

	HomePage HomePageObject;
	
	
	@Test
	public void UserCanSelectSubCategoryFromMainMenue() {
		
		HomePageObject=new HomePage(driver);
		HomePageObject.selectNoteBookMenue();
		Assert.assertTrue(HomePageObject.assertMassageElement.getText().contains("Notebooks"));
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
