#Author: samiksha.dongre@dhitechnologies.org
Feature: to switch to devloper account


 
  @DEVLOPER
  Scenario: if user login and switch to devloper and create template successfully
    Given user login and webapplication	
    When user try  to switch account  as a devloper
    Then user get redirected to devloper
    And in template  create template  successfully
    Then user logout and quitebrowser

 @DEVLOPER
  Scenario: To test to switch to devloper account
    Given user login and webapplication
    When user try  to switch account  as a devloper
    Then user get redirected to devloper
    Then user logout and quitebrowser
  @DEVLOPER
  Scenario: if user login and switch to devloper and controll devices successfully
    Given user login and webapplication
    When user try  to switch account  as a devloper
    Then user get redirected to devloper
    And  try to control devices
    Then user logout and quitebrowser
 @DEVLOPER
  Scenario: if user login and switch to devloper and controll devices successfully
    Given user login and webapplication
    When user try  to switch account  as a devloper
    Then user get redirected to devloper
    And  try to control devices
    Then user logout and quitebrowser
    