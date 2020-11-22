package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopingCartPage extends PageBase{

	public ShopingCartPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id="removefromcart11218")
	WebElement removeBtnElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")
	public WebElement productNameElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]")
	WebElement priceElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")
	WebElement productQuantityElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
	WebElement updateShopingCartBtnElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[2]")
	WebElement continueShoppingElement;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/input[1]")
	WebElement agreeElement;

	@FindBy(id="checkout")
	WebElement checkouteElement;
	
	

	public void UpdateProductToCart(String quantity) {
		clearText(productQuantityElement);
		setText(productQuantityElement, quantity);
		ClickButton(updateShopingCartBtnElement);


	}


	public void continueShopping()
	{
		ClickButton(continueShoppingElement);


	}


	public void CheckOut() {

		ClickButton(agreeElement);

		ClickButton(checkouteElement);

	}



}
