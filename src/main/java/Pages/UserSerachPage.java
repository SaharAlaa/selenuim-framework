package Pages;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserSerachPage  extends PageBase{

	public UserSerachPage(WebDriver driver) {
		super(driver);
		
	}
    
	
	@FindBy(id = "small-searchterms")
	WebElement searchElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/form[1]/input[2]")
	WebElement searchBtbElement;
	
	@FindBy(id="ui-id-1")
	List<WebElement> Productlist;
	
	@FindBy(linkText  = "Apple MacBook Pro 13-inch")
    public WebElement productElement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[10]/div[3]/input[1]")
	WebElement emailFriendBtnElement;
	
	
	public void ProductSearch(String searchKeyWord) {
		
		setText(searchElement, searchKeyWord);
		ClickButton(searchBtbElement);
		
	}
	
	public void OpenProductDetails() {
		
		ClickButton(productElement);
	}
	 
	
	public void ProductSearchUsingAutoSuggest(String searchString) {
		
		setText(searchElement, searchString);
		
		//try and catch for thread.sleep
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
	           System.out.println("thread sleep exception !!!!!!!");
			e.printStackTrace();
			
		}
		Productlist.get(0).click();
	}
	
	public void openEmailFriendPage() {
		
		ClickButton(emailFriendBtnElement);
		
	}
	
	
	
}
