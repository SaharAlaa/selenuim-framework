package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	
	@FindBy(id="gender-male")
	WebElement genderBtn;
	
	@FindBy(id="FirstName")
	WebElement Fname;
	
	
	@FindBy(id="LastName")
	WebElement Lname;
	
	@FindBy(id ="Email")
	WebElement Email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	WebElement registerBtn;
	
	@FindBy(xpath ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]")
    public WebElement sucessMassagElement ;
	
	@FindBy(linkText = "Log out")
	 public WebElement logOutElement;
	
	@FindBy(linkText = "My account")
	WebElement myAccountLinkElement;
	
	
	public void userRegisteration (String fristName , String lastName , String email, String password ) {
		
		ClickButton(genderBtn);
		setText(Fname,fristName);
		setText(Lname,lastName);
		setText(Email,email);
		setText(Password,password);
		setText(ConfirmPassword,password);
		ClickButton(registerBtn);
		
	}
	
	
	public void userLogOut() {
		ClickButton(logOutElement);
	}
	
	public void openMyAccountPage(WebDriver driver) {
		
		ClickButton(myAccountLinkElement);
		
		
	}
	
	
	
	
	
}
