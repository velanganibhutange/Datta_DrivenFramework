#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: validating Customer Module
@Customerdata
Scenario Outline: As Admin user Validate Add customer
When Open Browser
When Open Application url"http://webapp.qedgetech.com/"
When Wait For Username with "name" and "username"
When Enter Username with "name" and "username"
When Enter Password with "id" and "password"
When Click On Login with "name" and "btnsubmit"
When Wait For Customer with "xpath" and "(//a[starts-with(text(),'Customers')])[2]"
When Click On Customer with "xpath" and "(//a[starts-with(text(),'Customers')])[2]"
When Wait For AddButton with "xpath" and "(//span[@data-caption='Add'])[1]"
When Click On AddButton with "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait For CustomerNumber with "name" and "x_Customer_Number"
Then Capture Data with "name" and "x_Customer_Name"
When Enter in "<CustomerName>" with "id" and "x_Customer_Name"
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']"
When Enter in "<city>" with "xpath" and "//*[@id='x_City']"
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']"
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']"
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']"
When Enter in "<mail>" with "xpath" and "//*[@id='x_Email']"
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']"
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"
When Click On Add Button after adding notes with "id" and "btnAction"
When Wait For Ok Button with "xpath" and "//button[contains(text(),'OK!')]"
When Click On Ok Button with "xpath" and "//button[contains(text(),'OK!')]"
When Wait For Alert with "xpath" and "//button[starts-with(text(),'OK')])[6]"
When Click On Alert with "xpath" and "//button[starts-with(text(),'OK')])[6]"
Then user validate the customer table
When user closes the browser
 
Examples:
|CustomerName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Akhilesh1|srnagar1|Hyderabad|India|Rangaredddypasani1|1234567|test@gmail.com|8785259685|
|Akhilesh2|srnagar2|Hyderabad|India|Rangaredddypasani1|1234567|test@gmail.com|8785259685|
|Akhilesh3|srnagar3|Hyderabad|India|Rangaredddypasani1|1234567|test@gmail.com|8785259685|
|Akhilesh4|srnagar4|Hyderabad|India|Rangaredddypasani1|1234567|test@gmail.com|8785259685|
|Akhilesh5|srnagar5|Hyderabad|India|Rangaredddypasani1|1234567|test@gmail.com|8785259685|