@All
Feature: Login Functionality

#Background: Navigate the Website


@reg @smoke
Scenario Outline: Verify Successful login with valid credentials
When User enters valid "<username>" and "<password>"
And User click on login button
Then Validate successful login

Examples:
|username|password|
|standard_user|secret_sauce|


@reg 
Scenario: Verify successfull login with OTP
When User enters Mobile Number
And User enters OTP
Then Validates successful login



