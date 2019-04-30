package com.tradingview.Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

import com.tradingview.Base.testBase;

import junit.framework.Assert;

public class LaunchPage extends testBase{
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[3]/div/div[2]/div/a[1]")
	WebElement chartLunchBtn;
	@FindBy(xpath = "//div[@id=\"header-toolbar-symbol-search\"]/div/input[@class='input-3lfOzLDc-']")
	WebElement stock;
	public LaunchPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	public void openAapl() throws SikuliException, Exception {
		//Screen scrn = new Screen();
		//Pattern chart = new Pattern("C:\\Users\\zahed\\eclipse-workspace\\"
				//+ "com.tradingview\\screenshots\\lunchChart.PNG");

		//scrn.click(chart);
		//scrn.type("tsla");
		chartLunchBtn.click();
		stock.click();
		stock.sendKeys("aapl");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	//boolean title =	driver.getTitle().endsWith("AAPL");
		//Assert.assertEquals("AAPL",title);
	}
	public void openTsla() throws Exception {
		chartLunchBtn.click();
		stock.click();
		stock.sendKeys("tsla");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}

	public void openNio() throws Exception {
		chartLunchBtn.click();
		stock.click();
		stock.sendKeys("nio");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
}
