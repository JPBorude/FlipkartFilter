Feature: flipkart mobile webpage CustemerRating Checkbox filter functionality checking

Background: user successfully click CustemerRating checkbox
Given Launch browser "webdriver.chrome.driver" and .exe file "C:\\Selenium\\Browser\\chromedriver.exe"  path
Given User enter "https://www.flipkart.com" as url
Given User maximize Screen
Given User close login page
Given User enter "mobile" as text in search box and click on search

Scenario: User able to click on 4 Star and above Rating checkbox
When User click on 4 Star and above Rating
Then User able to select 4 Star and above Rating checkbox
Then close window

Scenario: User able to click on 3 Star and above Rating checkbox
When User click on 3 Star and above Rating
Then User able to select 3 Star and above Rating checkbox
Then close window

Scenario: User able to click on 2 Star and above Rating checkbox
When User click on 2 Star and above Rating
Then User able to select 2 Star and above Rating checkbox
Then close window

Scenario: User able to click on 1 Star and above Rating checkbox
When User click on 1 Star and above Rating
Then User able to select 1 Star and above Rating checkbox
Then close window