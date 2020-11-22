package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class PageBase {
	
	protected WebDriver driver;
	public JavascriptExecutor jse ;
	public Select select;
	public Actions action;
	
	public PageBase(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		jse = (JavascriptExecutor) driver; 
	


	}
	
	protected static void ClickButton(WebElement button) {
		
		
		button.click();
	}
	
	protected static void setText(WebElement Textelement ,String value) {
		
		 Textelement.sendKeys(value);
	}
	
	
	//Method to scrollDown
		public void scrollToBottom() 

		{
			jse.executeScript("scrollBy(0,2500)"); 
		}
		
		
		public void clearText(WebElement element) {
			
			element.clear();
			
		}

}
