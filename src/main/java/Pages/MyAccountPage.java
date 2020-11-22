package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "Change password")
	WebElement ChangepasswordLink ;
	
	
	@FindBy(id="OldPassword")
     WebElement oldPasswordeElement;
	
	@FindBy(id="NewPassword")
    WebElement NewPasswordElement;
	
	@FindBy(id="ConfirmNewPassword")
    WebElement ConfirmNewPassword;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]")
	WebElement changePassWordElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]")
	public WebElement resultLbElement;
	
	//click on change password link to open change password page 
	public void OpenChangePassWordPage() {
		
		ClickButton(ChangepasswordLink);
	}
	
	
	
	public void UserChangePassword(String OldPassWord, String NewPassWord ) {
		
		setText(oldPasswordeElement, OldPassWord);
		setText(NewPasswordElement, NewPassWord);
		setText(ConfirmNewPassword, NewPassWord);
		ClickButton(changePassWordElement);
		
		
	}
	
	
	

}
