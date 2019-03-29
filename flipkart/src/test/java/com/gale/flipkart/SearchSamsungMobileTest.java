package com.gale.flipkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDescriptionPage;
import pageObjects.SearchResultPage;

public class SearchSamsungMobileTest
{
	
	Logger log = Logger.getLogger(this.getClass());
	HomePage homePage;
	SearchResultPage searchResultPage;
	ProductDescriptionPage productDescriptionPage;
	
	@BeforeTest
    public void setupBrowser()
    {
    	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");				
		WebDriver driver = new ChromeDriver();	
		homePage = new HomePage(driver);
		searchResultPage = new SearchResultPage(driver);		
		productDescriptionPage = new ProductDescriptionPage(driver);	
		driver.manage().window().maximize();		
		driver.get("https://www.flipkart.com");			
    }
	
	
	public void search()
	{		
		homePage.getclosePopupButton();
		WebElement search = homePage.getSearchBox();
		search.sendKeys("Samsung Mobile");
		search.submit();
		
	}
	
	@Test
	public void viewSamsungMobile()
	{		
		search();		
		//searchResultPage.selectByIndex(2);
			
		WebElement first = searchResultPage.getFirstResult();
		first.click();
		WebElement name = productDescriptionPage.getProductName();
		Assert.assertEquals(first , name);
	}
	
	@Test
	public void filterByRatings()
	{
		search();
		searchResultPage.getratings().click();		
	}
	
}
