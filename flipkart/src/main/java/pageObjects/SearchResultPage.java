package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.PageFactory;

public class SearchResultPage 
{
	WebDriver driver;
	
	/*@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[2]/div[4]/div[1]/select[1]")
	WebElement priceFilter;*/
		
	public void selectByIndex(int index)
	{
	    
	Select priceDropDown = new Select(driver.findElement(By.className("fPjUPw")));
	priceDropDown.selectByIndex(index);
	
	}
	
	@FindBy(xpath="//div[contains(text(),'Samsung Galaxy On Nxt (Gold, 64 GB)')]")
	WebElement firstResult;
	
	@FindBy(xpath="//div[@class='_1p7h2j']")
	WebElement ratings;
	
	
	public WebElement getFirstResult()
	{
		return firstResult;
	}
	public WebElement getratings()
	{
		Actions action = new Actions(driver);
		action.moveToElement(ratings);
		action.perform();
		return ratings;
	}
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
 