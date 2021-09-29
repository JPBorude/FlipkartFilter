Feature: flipkart mobile webpage Internal Storage Checkbox filter functionality checking

Background: user successfully click on Internal storage checkbox
Given Launch browser "webdriver.chrome.driver" and .exe file "C:\\Selenium\\Browser\\chromedriver.exe"  path
Given User enter "https://www.flipkart.com" as url
Given User maximize Screen
Given User close login page
Given User enter "mobile" as text in search box and click on search
Given User click on Internal Storage dropdown

Scenario: User able to click on 256 GB & Above checkbox
When User click on 256 GB & Above
Then User able to select 256 GB & Above checkbox
Then close window

Scenario: User able to click on 128 - 255.9 GB checkbox
When User click on 128 - 255.9 GB
Then User able to select 128 - 255.9 GB checkbox
Then close window

Scenario: User able to click on 64 - 127.9 GB checkbox
When User click on 64 - 127.9 GB
Then User able to select 64 - 127.9 GB checkbox
Then close window

Scenario: User able to click on 32 - 63.9 GB checkbox
When User click on 32 - 63.9 GB
Then User able to select 32 - 63.9 GB checkbox
Then close window
