package com.tradingview.TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.SikuliException;

import com.tradingview.Base.testBase;
import com.tradingview.Page.LaunchPage;
import com.tradingview.Page.LoginPage;
import com.tradingview.Page.homePage;
import com.tradingview.Utils.TestUtil;

public class LaunchTest extends testBase{
	homePage hmPage;
	LoginPage loginPage;
	TestUtil testUtil;
	LaunchPage srchPg;

	public LaunchTest() throws Exception{
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		initialization();
		loginPage = new LoginPage();	
		srchPg = new LaunchPage();
		testUtil = new TestUtil();
		//hmPage = loginPage.login(prop.getProperty("username"),
				//prop.getProperty("password"));
		
	
	}
	
	@Test
	public void openAaplStock() throws Exception {
		srchPg.openAapl();
	}
	
	@Test
	public void openTslaStock() throws Exception{
		srchPg.openTsla();
		
	}
	
	@Test
	public void openNioStock() throws Exception{
		srchPg.openNio();
		
	}
	
	
	@After
	public void tearDown() throws InterruptedException{
		driver.quit();
	}

}
