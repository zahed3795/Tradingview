package com.tradingview.TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tradingview.Base.testBase;
import com.tradingview.Page.LogOutPage;
import com.tradingview.Page.LoginPage;
import com.tradingview.Page.homePage;
import com.tradingview.Utils.TestUtil;

public class LogOutPageTest  extends testBase{
	homePage hmPage;
	LoginPage logPage;
	LogOutPage logOt;
	TestUtil testUtil;
	
		public LogOutPageTest () throws Exception{
			super();
		}
		
			@Before
			public void setUp() throws Exception {
				initialization();
				//testUtil = new TestUtil();
				logPage = new LoginPage();
				hmPage = logPage.login(prop.getProperty("username"),
						prop.getProperty("password"));
				
			}
			
			
			@Test
			public void LogOutTest() throws Exception{
				//String title = logPage.validateLoginPageTitle();
				//Assert.assertEquals(title,"Portfolio | Robinhood");
				logOt = new LogOutPage();
				//logOt.logout();
				logOt.logout();
				
			}
			
			@After
			public void tearDown() throws Exception{
				driver.wait(1);
				driver.quit();
			}
		
		

}
