@regression
Feature: TopMenu functionalities
  As a user I want to verify calculator TopMenu Tabs

  @smoke
  Scenario: User should navigate to calculator net page successfully
    Given   I am on HomePage
    When    I click on financial link
    Then    I should navigate to financial calculators Page successfully

  @smoke
  Scenario: User should navigate to calculator net page successfully
    Given   I am on HomePage
    When    I click on fitness and health link
    Then    I should navigate to fitness and health calculators Page successfully

  @sanity
  Scenario: User should navigate to calculator net page successfully
    Given   I am on HomePage
    When    I click on other link
    Then    I should navigate to other calculators Page successfully
    And     I click on  conversion calculator slot
    Then    i should click to length slot
