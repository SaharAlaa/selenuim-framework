package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage  extends PageBase{

	public EmailFriendPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(id="FriendEmail")
	WebElement friendEmailElement;
	
	@FindBy(id="PersonalMessage")
	WebElement personalMessageElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
	WebElement sendEmailBtnElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]")
	public WebElement sucessMassagElement;
	  
	public void SendEmailToFriend(String friendEmailString , String personalMassageString) {
		
		setText(friendEmailElement, friendEmailString);
		setText(personalMessageElement, personalMassageString);
		
		ClickButton(sendEmailBtnElement);
		
		
		
	}
	
}
