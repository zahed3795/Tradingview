package com.tradingview.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	 static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zahed\\eclipse-workspace\\"
				+ "com.tradingview\\driver\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://www.tradingview.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		WebElement scrner= driver.findElement(By.xpath("//li[4]/a[contains(text(),'Screener')]")); 
		scrner.click();
	}

}
