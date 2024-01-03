@HomePageTest @Regression
Feature: Amazon Homepage test
  User want to verify the homepage functionality

  @HomePageTest
  Scenario: Amazon application Homepage title verification
    Given Open the Firefox browser and Launch the amazon application
    When User on amazon application homepage
    Then Confirm meta title of the page

  Scenario: Should not be Amazon Homepage
    Given Open the Firefox browser and Launch the amazon application
    When User navigate to different link
    Then Confirm meta title of the curent page
