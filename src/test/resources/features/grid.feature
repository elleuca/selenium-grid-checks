Feature: Ensure Selenium Grid Works
  In order to perform Selenium base tests
  As selenium test runner
  I should be able to access Selenium Grid

  Scenario: Contact the HUB
    Given I perform a selenium test
    When I contact the hub
    Then I should receive a reply from hub

  Scenario: Contact a Chrome Driver
    Given I perform a selenium test
    When I request a "Chrome" driver
    Then I should be able to use "Chrome" driver

  Scenario: Contact a Firefox Driver
    Given I perform a selenium test
    When I request a "Firefox" driver
    Then I should be able to use "Firefox" driver

  Scenario: Contact an Internet Explorer Driver
    Given I perform a selenium test
    When I request a "Internet Explorer" driver
    Then I should be able to use "Internet Explorer" driver