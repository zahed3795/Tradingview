package com.tradingview.TestCases;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tradingview.Base.testBase;
import com.tradingview.Page.LoginPage;
import com.tradingview.Page.homePage;
import com.tradingview.Utils.TestUtil;

import junit.framework.Assert;

public class LoginPageTest  extends testBase{
	homePage hmPage;
	LoginPage loginPage;
	TestUtil testUtil;
	
public LoginPageTest() throws Exception {
	super();
}

@Before
public void setUp() throws Exception {
	initialization();
	loginPage = new LoginPage();
	
}

@Test
public void loginPageTitleTest() {
	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title,"Free Stock Charts, Stock Quotes and Trade Ideas — TradingView");
	System.out.println(title);
}

@Test
public void loginTest() throws Exception{
	hmPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@After
public void tearDown() throws InterruptedException{
	driver.wait(1);
	driver.quit();
}

}
