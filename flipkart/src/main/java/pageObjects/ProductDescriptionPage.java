package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionPage
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='_35KyD6']")
	WebElement productName;

	public WebElement getProductName()
	{
		return productName;
	}
	
	public ProductDescriptionPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
