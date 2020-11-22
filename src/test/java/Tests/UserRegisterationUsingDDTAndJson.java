package Tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;

import org.testng.annotations.Test;

import Data.JsonDataReader;
import Pages.HomePage;
import Pages.UserLoginPage;
import Pages.UserRegisterationPage;

public class UserRegisterationUsingDDTAndJson extends TestBase {

	HomePage homePageObject;
	UserRegisterationPage RegisterationObject;
	UserLoginPage LoginObject ;

	@Test(priority = 1 )
	public void UserCanRegisterSuccessflly() throws IOException, ParseException {

		JsonDataReader jsonDataReader=new JsonDataReader();
		System.out.println("asasasasa");
		jsonDataReader.JsonReader();
		System.out.println("asasasasa11");
		homePageObject =new HomePage(driver);
		homePageObject.openRegisterationPage(driver);
		RegisterationObject = new UserRegisterationPage(driver);
		RegisterationObject.userRegisteration(jsonDataReader.firstname,jsonDataReader.lastname, jsonDataReader.email, jsonDataReader.password);
		Assert.assertTrue(RegisterationObject.sucessMassagElement.getText().contains("Your registration completed"));

		RegisterationObject.userLogOut();
	}



}
