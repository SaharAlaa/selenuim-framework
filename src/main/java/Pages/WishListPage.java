package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WishListPage extends PageBase{

	public WishListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		
		
		@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	        WebElement productElement;
		@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
		 WebElement removeElement;
	   @FindBy(xpath ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/h1[1]")
       public WebElement assertMassElement;
	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	   WebElement updateWishListBtnElement;
	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
	  public WebElement emptyassertionMassageeElement;
	   
	   public void RemoveProductFromWishList() {
		   ClickButton(removeElement);
		   ClickButton(updateWishListBtnElement);
		    
		   
		   
		   
	   }
	   
	   
	   
}
