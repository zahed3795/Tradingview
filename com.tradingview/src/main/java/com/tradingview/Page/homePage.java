package com.tradingview.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradingview.Base.testBase;


public class homePage extends testBase{
	LogOutPage logOt;
	
	@FindBy(xpath = "/html/body/div[7]/div/a[1]/span[1]")
	WebElement zahid;
	



	public homePage() throws Exception {
		
		PageFactory.initElements(driver, this);
		
	}
	

	public  String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() throws Exception{
		
		return zahid.isDisplayed();
	
	}
	
	
	
}
