#Author: samiksha.dongre@dhitechnologies.org
Feature: Login Fuctionality to test by admin , member and enterprise user /admin

  @regression
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
    Then user logout and quitebrowser

    Examples: 
      | Username     | Password     | status  |
      | dhi-siddhant | Siddhant1!   | success |
  

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
    Then user logout and quitebrowser

    Examples: 
      | Username     | Password     | status  |
      | dhi-nikhil   | DHIdhi@2022  | success |
      | dhi-samiksha | YI7M84sh!gJx | success |
      | dhi-siddhant | Siddhant1!   | success |
      | DHI-NIKHIL   | DHIdhi@2022  | success |
      | DhI-NIkHiL   | DHIdhi@2022  | success |

  @test 
  Scenario Outline: To test login for  incorrect <emailaddress> corporate
    Given Open web browser
    And Enter corporate url
    And Enter username as <Username>
    When Click on sign in
    Then User get error messg

    Examples: 
      | Username                        | status  | emailaddress              |
      | tester+6009@dhitechnologies.org | success | unregister corporate user |
      | uhfgeiurhfiu                    | success | other user                |
      | dhi.samiksha                    | success | other user                |
      |                     12324234535 | success | other user                |
      | uhfgeiurhfiu                    | success | other user                |