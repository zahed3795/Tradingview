package com.tradingview.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradingview.Base.testBase;


	public class LoginPage extends testBase{
		
		@FindBy(xpath="//span/a[contains(text(),'Sign In')]")
		WebElement logInBtn;
		
		@FindBy(xpath="//input[@name='username' and @type = 'text' and @autocomplete ='username']")
		WebElement username;
		
		@FindBy(xpath="//div[1]/div[1]/input[@name = 'password'] ")
		WebElement password;
		
		@FindBy(xpath="//button//span[@class = 'tv-button__loader']")
		WebElement signinBtn;
		
		
		public LoginPage() throws Exception{
			PageFactory.initElements(driver, this);
	
		}
		
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public homePage login(String un, String pwd) throws Exception{
			logInBtn.click();
			username.sendKeys(un);
			password.sendKeys(pwd);
			signinBtn.click();
			    	
			return new homePage();
		}
		
	}
