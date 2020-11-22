package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase{

	public ProductReviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(id="AddProductReview_Title")
	WebElement reviewTitleElement;
	
	@FindBy(id="AddProductReview_ReviewText")
	WebElement reviewTextElement;
	
	@FindBy(id="addproductrating_3")
	WebElement RatingRadioBtnElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement submitReviewBtnElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
	public WebElement AddReviewSucessMassage;
	
	@FindBy(linkText = "Log out")
	public WebElement logoutElement;
	
	
	public void AddRpductReview(String reviewTitleString , String reviewTesxtString) {
		
		setText(reviewTitleElement, reviewTitleString);
        setText(reviewTextElement, reviewTesxtString);
        ClickButton(RatingRadioBtnElement);
		ClickButton(submitReviewBtnElement);
		System.out.println("bdhsgdhsgdhgsdhgsdhgshd");
		
	}
	
	public void LogOut() {
		
		ClickButton(logoutElement);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
