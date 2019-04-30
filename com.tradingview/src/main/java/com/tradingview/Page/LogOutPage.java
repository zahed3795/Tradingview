package com.tradingview.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.tradingview.Base.testBase;

public class LogOutPage extends testBase{
	

	WebElement zahedBtn = driver.findElement(By.xpath("//span[@class='tv-header__dropdown-wrap tv-dropdown-behavior__button']"));
	
	@FindBy(xpath="//div[2]/a[1]/span")
	WebElement logoutBtn;

	public LogOutPage() throws Exception{
		PageFactory.initElements(driver, this);
	}

	public void logout() throws Exception{
		
		Screen scrn = new Screen();
		Pattern zahed3795 = new Pattern("C:\\Users\\zahed\\eclipse-workspace\\com.tradingview\\screenshots\\account.PNG");
		scrn.click(zahed3795);
		//scrn.click(zahed3795);
		zahedBtn.click();
		logoutBtn.click();
	}

}
