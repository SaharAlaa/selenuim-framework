package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;

public class UserRegisterationUsingDataDrivenProvider  extends TestBase{

	
	
	
	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
	UserLoginPage LoginObject ;
    
	
	
	@DataProvider(name="testData")
	public static Object[][] UserData(){
		
		return new Object[][] {
			{"sahar","alaa","sahasralaa@gmail.com","12345678"},
			{"mohamed","alaa","mohamesdalaa@gmail.com","12345678"}
			
		};
		
	}
	
	

	@Test(priority = 1 , dataProvider ="testData")
	public void UserCanRegisterSuccessflly(String Fname,String lname, String email , String password) {


		homePageObject =new HomePage(driver);



		homePageObject.openRegisterationPage(driver);


		RegisterationObject = new UserRegisterationPage(driver);


		RegisterationObject.userRegisteration(Fname,lname, email, password);

		Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Your registration completed"));
		
		RegisterationObject.userLogOut();
	}

	 
	
	
	
	
	
	
	
}
