package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	

	}


	@FindBy(id="BillingNewAddress_CountryId")
	WebElement countrylist;

	@FindBy(id="BillingNewAddress_City")
	WebElement cityElement;

	@FindBy(id = "BillingNewAddress_Address1")
	WebElement address_1Element;

	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement zipPostalCodeElement;

	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phoneNumberElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/input[1]")
	WebElement shippingRadioBtnElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")
	WebElement paymentRadioBtnElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]")
	WebElement billingContinueBtnElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]")
	WebElement shippingContinueBtnElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]")
	WebElement paymentContinueBtnElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]")
	WebElement payInfoContinueBtnElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/input[1]")
	WebElement confirmBtnElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]")
        public  WebElement checkOutSucessMassagElement;

	public void RegisteredUserCheckOut(String countryName , String city, String address1 , String postalCode , String phoneNumer) {
		
		
		 select =new Select(countrylist);
		 select.selectByVisibleText(countryName);
		 
		 setText(cityElement, city);
		 setText(address_1Element, address1);
		 setText(zipPostalCodeElement, postalCode);
		 setText(phoneNumberElement, phoneNumer);
		 ClickButton(billingContinueBtnElement);
		 ClickButton(shippingRadioBtnElement);
		 ClickButton(shippingContinueBtnElement);
		 ClickButton(paymentRadioBtnElement);
		 ClickButton(paymentContinueBtnElement);
		 ClickButton(payInfoContinueBtnElement);
		 ClickButton(confirmBtnElement);
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
