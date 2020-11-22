package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountactUsPage extends PageBase {

	public CountactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="FullName")
	WebElement fullNamElement;
	
	@FindBy(id="Email")
	WebElement emailElement;
	
	@FindBy(id="Enquiry")
	WebElement enquiryElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
	WebElement submitBtnElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]")
	public WebElement suceesMassagElement;
	
	public void SendInQueryToContactUs(String fullNameString, String emailString , String iNQUERYString) {
		
		setText(fullNamElement, fullNameString);
		setText(emailElement, emailString);
		setText(enquiryElement, iNQUERYString);
		ClickButton(submitBtnElement);
		
		
	}

}
