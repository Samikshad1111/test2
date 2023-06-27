#Author: samiksha.dongre@dhitechnologies.org
Feature: Login Fuctionality to test by admin , member and enterprise user /admin

  @Corporate @DONE
  Scenario Outline: To test login for  corporate
    Given Open web browser
    And Enter corporate url
    And Enter username as <Username>
    When Click on sign in
    Then User  get redirect to otp page
    And Click on try another to login with password
    And Enter password as <Password>
    When Click on verify
    Then User redirect to dashboard
    When user click on profile to switch account or logout
    And User switch on  corporate web app

    Examples: 
      | Username     | Password     | status  |
      | dhi-siddhant | Siddhant1!   | success |
      | dhi-samiksha | YI7M84sh!gJx | success |

  @Corporate @DONE
  Scenario: To test to switch to devloper account
    Given user login and webapplication
    When user try  to switch account  as a corporate
    Then user get redirected to corporate
    Then user logout and quitebrowser

  @sanity @DONE
  Scenario: To test on  user
    Given user login and webapplication
    When user try  to switch account  as a corporate
    Then user get redirected to corporate
    Given on dashboard admin click on  User
    When User click on add user

  @adduser
  Scenario Outline: To test on  ADD User
    Given user login and webapplication
    When user try  to switch account  as a corporate
    Then user get redirected to corporate
    Given on dashboard admin click on  User
    When User click on add user
    When admin   enter adduser details<first name>, <last name> ,<useremail> ,<contact>,<password>
    When User click on add user
    Examples:
      | first name | last name    | useremail                       | contact    |password|
      | fgbdtfb    | tygbhfgthnty | tester+5954@dhitechnologies.org | 8830963568 |ergvdfrg123SSE|

  @addusery @todo
  Scenario Outline: To test on  ADD User
    Given user login and webapplication
    When user try  to switch account  as a corporate
    Then user get redirected to corporate
    Given on dashboard admin click on  User
    When User click on add user
    And Admin Enter firstname as <first name>
    And Admin Enter Lastname as <last name>
    And Admin Enter Email as <useremail>
    And Admin Enter phone number as <contact>
    When click on AddUser

    Examples: 
      | first name | last name    | useremail                       | contact    |
      | fgbdtfb    | tygbhfgthnty | tester+5654@dhitechnologies.org | 8830963568 |

  @GROUP @DONE
  Scenario: To test on groups in corporate
    Given user login and webapplication
    When user try  to switch account  as a corporate
    Then user get redirected to corporate
    When on dashboard admin click on  group
    Then admin get redirect to group page

  @smoke
  Scenario: To test on add user new email
    Given user login and webapplication
    When user try  to switch account  as a corporate
    Then user get redirected to corporate
    Given Admin on dashboard
    Given on dashboard admin click on  User
    Then admin get redirect to user page
    When User click on add user
    And Admin addnewuaser firstname as <first name>
    And Admin Enter Lastname as <last name>
    And Admin Enter Email as <useremail>
    And Admin Enter phone number as <contact>
    And Admin Enter User role
    When click on AddUser
    Then Admin recive success or error messg
    
    
    
    
    
    
    
    