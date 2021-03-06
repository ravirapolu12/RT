$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium/Amazon/src/main/java/com/capgemini/feature/product.feature");
formatter.feature({
  "line": 1,
  "name": "Place an Order",
  "description": "",
  "id": "place-an-order",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to place an order",
  "description": "",
  "id": "place-an-order;user-should-be-able-to-place-an-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "search for the product",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on buy now",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "choose the delivery address",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "choose the mode of payment",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Place an order",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.open_browser()"
});
formatter.result({
  "duration": 15979598401,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 3843702200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1642908200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 2258353601,
  "status": "passed"
});
formatter.match({
  "location": "PlaceProductStepDefinition.search_for_the_product()"
});
formatter.result({
  "duration": 9224289300,
  "status": "passed"
});
formatter.match({
  "location": "PlaceProductStepDefinition.click_on_buy_now()"
});
formatter.result({
  "duration": 10266719100,
  "status": "passed"
});
formatter.match({
  "location": "PlaceProductStepDefinition.choose_the_delivery_address()"
});
formatter.result({
  "duration": 10238560601,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Deliver to this address\u0027)]\"}\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-9FGUM7T\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\TEJARA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55438}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9dd24183486c3cbb11c688b988798a5f\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Deliver to this address\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.capgemini.order.page.DeliveryPage.deliveryAddress(DeliveryPage.java:17)\r\n\tat com.capgemini.stepdefinition.PlaceProductStepDefinition.choose_the_delivery_address(PlaceProductStepDefinition.java:36)\r\n\tat ✽.Then choose the delivery address(D:/Selenium/Amazon/src/main/java/com/capgemini/feature/product.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PlaceProductStepDefinition.choose_the_mode_of_payment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PlaceProductStepDefinition.place_an_order()"
});
formatter.result({
  "status": "skipped"
});
});