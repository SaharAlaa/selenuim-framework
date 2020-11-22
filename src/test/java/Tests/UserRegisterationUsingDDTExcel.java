package Tests;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Data.ExcelReader;
import Pages.HomePage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;

public class UserRegisterationUsingDDTExcel extends TestBase {

	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
	UserLoginPage LoginObject ;



	@DataProvider(name="ExcelData")
	public Object[][] UserRegisterData() throws IOException{

		ExcelReader excelReader=new ExcelReader();
		return excelReader.getExcelData();

	}

	@Test(priority = 1 , dataProvider ="ExcelData")
	public void UserCanRegisterSuccessflly(String Fname,String lname, String email , String password) {



		homePageObject =new HomePage(driver);
		homePageObject.openRegisterationPage(driver);
		RegisterationObject = new UserRegisterationPage(driver);
		RegisterationObject.userRegisteration(Fname,lname, email, password);
		Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Your registration completed"));
		RegisterationObject.userLogOut();
		
	}






}
