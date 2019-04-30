package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mostHLoftheday  {
	 WebDriver driver = null;

	 @Given("^Title of login page is tradingview$")
	 public void title_of_login_page_is_tradingview()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zahed\\eclipse-workspace\\"
				+ "com.tradingview\\driver\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://www.tradingview.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	 
	}

	@When("^Click on market summary\\.$")
	public void click_on_market_summary()   {
		WebElement marketQU = driver.findElement(By.xpath("//div[2]/div[1]/div/div[1]/div[1]/h2/a[@class='tv-feed-widget__title-link js-widget-title-link']"));
		  marketQU.click();
	    
	}

	@Then("^Click on Stocks price\\.$")
	public void click_on_Stocks_price()  {
	    WebElement stPrice = driver.findElement(By.xpath("//div[6]/div/div[1]/div[1]/h3/a[@class='tv-feed-widget__title-link js-widget-title-link']"));
	    stPrice.click();
	}

	@Then("^Clicks on MostActive of the day,$")
	public void clicks_on_MostActive_of_the_day()  {
	WebElement mostAct =driver.findElement(By.xpath("//div[1]/div/div/a[4][@class='tv-category-tab']"));
	mostAct.click();
	}

	@Then("^Click on most active of the day\\.$")
	public void click_on_most_active_of_the_day()  {
		
	  WebElement mostAct = driver.findElement(By.xpath("//tr[1]/td[1]/div/div[2]/a[@href]"));
	  mostAct.click();
	}

}
