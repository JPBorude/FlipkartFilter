Feature: flipkart mobile webpage RAM Checkbox filter functionality checking

Background: user successfully click checkbox
Given Launch browser "webdriver.chrome.driver" and .exe file "C:\\Selenium\\Browser\\chromedriver.exe"  path
Given User enter "https://www.flipkart.com" as url
Given User maximize Screen
Given User close login page
Given User enter "mobile" as text in search box and click on search

@SmokeTest
Scenario: User able to click on 6GB RAM checkbox
When User click on 6GB and above
Then User able to select 6GB and above checkbox
Then close window

@SmokeTest
Scenario: User able to click on 4GB RAM checkbox
When User click on 4GB 
Then User able to select 4GB checkbox
Then close window

@SmokeTest
Scenario: User able to click on 3GB RAM checkbox
When User click on 3GB 
Then user able to select 3GB checkbox
Then close window

@SmokeTest
Scenario: User able to click on 2GB RAM checkbox
When User click on 2GB 
Then User able to select 2GB checkbox
Then close window

@SmokeTest
Scenario: User able to click on 1GB RAM checkbox
When User click on 1GB 
Then User able to select 1GB checkbox
Then close window

@SmokeTest
Scenario: User able to click on 512MB-1GB RAM checkbox
When User click on 512MB-1GB 
Then User able to select 512MB-1GB checkbox
Then close window

@SmokeTest
Scenario: User able to click on Less Than 512MB RAM checkbox
When User click on Less Than 512MB
Then User able to select Less Than 512MB checkbox
Then close window