Feature: Test the application

@FuctionalTest
Scenario: Successful login
Given login as valid user

@RegressionTest
Scenario: Unsuccessful login
Given Enter the invalid username &password


@SmokeTest
Scenario: Edit user profile
Given the username & password
Then Edit useerprofile with valid data