package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/h1[1]")
public WebElement productDeatailsElement;

@FindBy(linkText = "Add your review")
public WebElement addReviewlinkElement;

@FindBy(xpath  = "/html[1]/body[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[10]/div[1]/input[1]")
WebElement addToWishListBtnElement;

@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]")
public WebElement wishListBtnInUpperBarElement;


@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[9]/div[2]/input[2]")
public WebElement addToCardBtnElement;

@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/span[1]")
WebElement shoppingCartElement;

public void OpenAddReviewPage() {
	
	
	ClickButton(addReviewlinkElement);
}

public void AddProductToWishListPage() {
	
	ClickButton(addToWishListBtnElement);
}


public void OpenWishListPage() {
	
	ClickButton(wishListBtnInUpperBarElement);
	
}


public void AddTOCart() {
	
	ClickButton(addToCardBtnElement);
}
  

public void OpenShoppingCart() {
	
   ClickButton(shoppingCartElement);
	
}

}
