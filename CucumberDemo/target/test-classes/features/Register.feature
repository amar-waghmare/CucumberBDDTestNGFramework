Feature: Register Functionality

#-----------------------------------------------------------------------
Scenario: Verify user is able to create account with valid details

Given user is on home page 
When user clicks on register link 
Then user navigates to Register Account
When user enter firstname and lastname and email and password and check marked Privacy Policy and clicked on continue
|david|test1|david@test1.com|Test@1234|
Then account created successfully and shows "Your Account Has Been Created!"

#----------------------------------------------------------------------
Scenario: Verify user unable to create account with invalid details - Tried with existing email

Given user is on home page 
When user clicks on register link 
Then user navigates to Register Account
When user enter firstname and lastname and email and password and check marked Privacy Policy and clicked on continue
|david|test1|david@test1.com|Test@1234|
Then account not created and showing user already have account
