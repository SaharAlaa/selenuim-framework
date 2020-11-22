package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase {

	public UserLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="Email")
	WebElement EmailElement;
	
	@FindBy(id="Password")
	WebElement PasswordElement;
	
	@FindBy(xpath ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]")
	WebElement lognBtnElement;
	
	public void userLogin(String emailString , String password) {
		
		setText(EmailElement, emailString);
		setText(PasswordElement, password);
		ClickButton(lognBtnElement);
		
		
	}
	

}
