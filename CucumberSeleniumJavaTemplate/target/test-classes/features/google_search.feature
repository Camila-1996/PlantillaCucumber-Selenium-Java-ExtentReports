Feature: Google Search

  Scenario: Search for Cucumber
    Given I open the Google homepage
    When I search for "Cucumber BDD"
    Then the page title should start with "Cucumber BDD"