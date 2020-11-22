package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CountactUsPage;
import Pages.HomePage;

public class ContactUsTest extends TestBase{

	HomePage homePageObject;
	CountactUsPage ContactUsPageObect;
	String FullName="sahar";
	String Email="sahaar@gmail.com";
	String inquery="jshdjshdjh";
	
	@Test
	public void UserCanSendInquirySuccessfully() {
		
		homePageObject=new HomePage(driver);
		homePageObject.OpenContactUs(driver);
		ContactUsPageObect= new CountactUsPage(driver);
		ContactUsPageObect.SendInQueryToContactUs(FullName,Email,inquery);
		Assert.assertTrue(ContactUsPageObect.suceesMassagElement.getText().contains("Your enquiry has been successfully sent to the store owner"));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
