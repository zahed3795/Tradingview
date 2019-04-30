package com.tradingview.TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tradingview.Base.testBase;
import com.tradingview.Page.LogOutPage;
import com.tradingview.Page.LoginPage;
import com.tradingview.Page.homePage;
import com.tradingview.Utils.TestUtil;

import junit.framework.Assert;


public class homePageTest extends testBase {
	LoginPage logPage;
	LogOutPage logOt;
	homePage hmPage;
	TestUtil testUtil;
	//ATUTestRecorder recorder = new 	ATUTestRecorder(null);
	
	public homePageTest() throws Exception {
		super();
	}


	@Before
	public void setUp() throws Exception {
		//recorder.start();
		initialization();
		testUtil = new TestUtil();
		logPage = new LoginPage();
		hmPage = logPage.login(prop.getProperty("username"),
				prop.getProperty("password"));
	}
	
	
	//@Test
	public void verifyHomePageTitleTest() throws Exception{
		String homePageTitle = hmPage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"Stock Screener — Search and Filter Stocks — TradingView");
	
		
	}
	
	@Test
	public void verifyUserNameTest() throws Exception{
		testUtil.switchToFrame();
		Assert.assertTrue(hmPage.verifyCorrectUserName());
		System.out.println("Printing<><><><><"+hmPage.verifyCorrectUserName());
	}
	
	
	
	@After
	public void tearDown() throws Exception{
		//driver.wait(1);
		logOt.logout();
		driver.quit();
		//recorder.stop();
	}
	
	

}
