package com.tradingview.TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tradingview.Base.testBase;
import com.tradingview.Page.LaunchPage;
import com.tradingview.Page.LoginPage;
import com.tradingview.Page.Screener;
import com.tradingview.Page.homePage;
import com.tradingview.Utils.TestUtil;

public class ScreenerTest extends testBase{
	homePage hmPage;
	Screener scrner = new Screener (); 
	TestUtil testUtil;
	public ScreenerTest() throws Exception {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		initialization();	
		testUtil = new TestUtil();
	}
		
	@Test
	public void fullScreener() {
		scrner.FllStockScreener();
	}
	@After
	public void tearDown() throws InterruptedException{
	//	driver.quit();
	}

}
