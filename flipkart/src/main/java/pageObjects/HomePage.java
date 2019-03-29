package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchBox;
	
	
	@FindBy(xpath="//a[contains(text(),'Login & Signup')]")
	WebElement loginButton;
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement closePopupButton;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSearchBox()
	{
		return searchBox;
	}
	
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	public WebElement getclosePopupButton()
	{
		return closePopupButton;
	}
}

