package com.tradingview.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradingview.Base.testBase;

public class Screener  extends testBase{
	
	@FindBy(xpath="//li[4]/a[contains(text(),'Screener')]")
	WebElement scr;
	
	public Screener()  throws Exception{
		PageFactory.initElements(driver, this);
	}

	public void FllStockScreener() {
		scr.click();
	}
	
	
}
