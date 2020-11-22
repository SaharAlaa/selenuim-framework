package Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		jse=(JavascriptExecutor)driver;
		action=new Actions(driver);

	}



	@FindBy(linkText ="Register" )
	WebElement registerLink;

	@FindBy(linkText = "Log in")
	WebElement loginLink;

	@FindBy(linkText = "Contact us")
	WebElement contactUSElement;

	@FindBy(id="customerCurrency")
	WebElement currencyList;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/span[1]")
	public WebElement checkCurrencyElement;
	
	@FindBy(linkText = "Computers")
	WebElement computerMenuElement; //hover
	
	@FindBy(xpath  = "/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
	WebElement notebooksDropMenueElement; //click
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[2]/div[2]/div[1]/div[1]/h1[1]")
	public WebElement  assertMassageElement;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/span[1]")
	public WebElement shoppingCartElement;
	
	
	public void openRegisterationPage (WebDriver driver) {

		ClickButton(registerLink);


	}

	public void openLoginPage (WebDriver driver) {

		ClickButton(loginLink);


	}

	public void OpenContactUs(WebDriver driver) {

		scrollToBottom();
		ClickButton(contactUSElement);

	}

	public void ChangeCurrency() {

		select =new Select(currencyList);
		select.selectByVisibleText("Euro");
	}
	
	
	public void selectNoteBookMenue() {
		
		action.moveToElement(computerMenuElement)
		.moveToElement(notebooksDropMenueElement)
		.click()
		.build()
		.perform();
	
		
	}
	
	public void openShoppingCart() {
		
		ClickButton(shoppingCartElement);
		
	}
	
	


}
