$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/zahed/eclipse-workspace/com.tradingview/src/test/java/com/tradingview/features/mostHLoftheday.feature");
formatter.feature({
  "line": 1,
  "name": "Tradingview Feature.",
  "description": "",
  "id": "tradingview-feature.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Tradingview Most Active,loss and gain Test Scenario.",
  "description": "",
  "id": "tradingview-feature.;tradingview-most-active,loss-and-gain-test-scenario.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Title of login page is tradingview",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on market summary.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Stocks price.",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicks on MostActive of the day,",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on most active of the day.",
  "keyword": "Then "
});
formatter.match({
  "location": "mostHLoftheday.title_of_login_page_is_tradingview()"
});
formatter.result({
  "duration": 27736209658,
  "status": "passed"
});
formatter.match({
  "location": "mostHLoftheday.click_on_market_summary()"
});
formatter.result({
  "duration": 3824517778,
  "status": "passed"
});
formatter.match({
  "location": "mostHLoftheday.click_on_Stocks_price()"
});
formatter.result({
  "duration": 3287012321,
  "status": "passed"
});
formatter.match({
  "location": "mostHLoftheday.clicks_on_MostActive_of_the_day()"
});
formatter.result({
  "duration": 482625125,
  "status": "passed"
});
formatter.match({
  "location": "mostHLoftheday.click_on_most_active_of_the_day()"
});
formatter.result({
  "duration": 30712633,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//tr[1]/td[1]/div/div[2]/a[@href]\"}\n  (Session info: chrome\u003d73.0.3683.103)\n  (Driver info: chromedriver\u003d73.0.3683.68 (47787ec04b6e38e22703e856e101e840b65afe72),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027ZAHED\u0027, ip: \u0027192.168.0.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 73.0.3683.68 (47787ec04b6e3..., userDataDir: C:\\Users\\zahed\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62616}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.103, webStorageEnabled: true}\nSession ID: 738b15539226ec76ab0cf98e26889260\n*** Element info: {Using\u003dxpath, value\u003d//tr[1]/td[1]/div/div[2]/a[@href]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinitions.mostHLoftheday.click_on_most_active_of_the_day(mostHLoftheday.java:47)\r\n\tat ✽.Then Click on most active of the day.(/Users/zahed/eclipse-workspace/com.tradingview/src/test/java/com/tradingview/features/mostHLoftheday.feature:9)\r\n",
  "status": "failed"
});
});