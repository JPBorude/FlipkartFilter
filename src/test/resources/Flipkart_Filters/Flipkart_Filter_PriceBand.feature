Feature: flipkart mobile webpage price band filter functionality checking

Background: User successfully apply all filter
Given Launch browser "webdriver.chrome.driver" and .exe file "C:\\Selenium\\Browser\\chromedriver.exe"  path
Given User enter "https://www.flipkart.com" as url
Given User maximize Screen
Given User close login page
Given User enter "mobile" as text in search box and click on search

@SmokeTest
Scenario Outline: Checking price range with valid price band
When user select <minimum> as minimum price
When user select <maximum> as maximum price
Then user get respective price band in filters

Examples: 
|minimum|maximum|
|2000|4000|
|4000|13000|
|4000|50000|
|16000|25000|

@SmokeTest
Scenario Outline: Checking price range with invalid price band
When user select <minimum> as minimum price
When user select <maximum> as maximum price
Then user get respective price band in filters

Examples:
|minimum|maximum|
|12000|4000|
|2000|40000|
|40000|50000|
|1600|25000|


 