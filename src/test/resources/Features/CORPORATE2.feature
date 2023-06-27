 #Author: samiksha.dongre@dhitechnologies.org
Feature: to test the scenario of crate temple with multiple inputes 
 
  @template
  Scenario Outline: Admin try to create template in corporate
    Given user login and webapplication
    When user try  to switch account  as a corporate
    Then user get redirected to corporate
    Given on dashboard admin click on TEMPLATE
    And Admin  Enter Device  <deviecName>
    And Admin click on Add features
  
 Examples:
 |deviecName|
 |device1|
 
 @templates @todo
  Scenario Outline: Admin try to create template in corporate
    Given user login and webapplication
    When user try  to switch account  as a corporate
    Then user get redirected to corporate
    Given on dashboard admin click on TEMPLATE
    When Admin click on Create new Device Template
    And Admin  Enter Device  <deviecName>
    And Admin click on Add features
    And Admin Enter <slot> <featureName >
    And Admin select   feature devicetype
    When Admin click on create device type
    Then Admin recive Inventory success  or error messg
 Examples:
 |deviecName|slot|featureName|
 |device1|S01|Color Device|
 
    