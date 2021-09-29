Feature: flipkart mobile webpage Brand filter functionality checking

Background: 
Given Launch browser "webdriver.chrome.driver" and .exe file "C:\\Selenium\\Browser\\chromedriver.exe"  path
Given User enter "https://www.flipkart.com" as url
Given User maximize Screen
Given User close login page
Given User enter "mobile" as text in search box and click on search

Scenario: User able to click on realme Brand checkbox
When user click on realme brand checkbox
Then User able to select realme brand checkbox
Then close window

Scenario: User able to click on POCO Brand checkbox
When user click on POCO brand checkbox
Then User able to select POCO brand checkbox
Then close window

Scenario: User able to click on Infinix Brand checkbox
When user click on Infinix brand checkbox
Then User able to select Infinix brand checkbox
Then close window

Scenario: User able to click on SAMSUNG Brand checkbox
When user click on SAMSUNG brand checkbox
Then User able to select SAMSUNG brand checkbox
Then close window

Scenario: User able to click on Mi Brand checkbox
When user click on Mi brand checkbox
Then User able to select Mi brand checkbox
Then close window

Scenario: User able to click on APPLE Brand checkbox
When user click on APPLE brand checkbox
Then User able to select APPLE brand checkbox
Then close window
