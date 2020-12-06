$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/loginAndSearchBike.feature");
formatter.feature({
  "name": "Login and search Tour",
  "description": "  As a user,\n  I want to the Login and Search Tour Plans",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to be able to search bike tour",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the site",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.SearchBikeSteps.iLaunchSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login using email \u0027learngermankarthi@gmail.com\u0027 and password \u0027Klk@129345\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "steps.SearchBikeSteps.iLoginUsingEmailAndPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for tour \u0027bike\u0027 in location \u0027Munich\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SearchBikeSteps.i_Search_Tour_in_Location(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I apply difficulty \u0027Easy\u0027 and distance 3 filters",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SearchBikeSteps.i_Apply_Diffculty_And_Distance_Filters(java.lang.String,int)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[contains(@class,\u0027c-difficulty-filter--easy\u0027)]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-QA787IDP\u0027, ip: \u0027172.26.128.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\KARTHI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55472}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 41b7e1571bbcd70a0f6a579e0d9d98eb\n*** Element info: {Using\u003dxpath, value\u003d//*[contains(@class,\u0027c-difficulty-filter--easy\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat helpers.FileBasedElementLocator.findElement(FileBasedElementLocator.java:37)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pages.SearchResultsPage.selectDifficulty(SearchResultsPage.java:45)\r\n\tat steps.SearchBikeSteps.i_Apply_Diffculty_And_Distance_Filters(SearchBikeSteps.java:75)\r\n\tat ✽.I apply difficulty \u0027Easy\u0027 and distance 3 filters(file:///C:/Users/Karthik%20L/Downloads/automationtask-sevensenders/src/test/resources/features/loginAndSearchBike.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the filtered search results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SearchBikeSteps.isDisplayingOnlyFilteredSearchResults()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});