#Author: xxx@gmail.com
#Feature: Login Feature
@HomepageTest @Regression
Feature: Amazon Homepage test
  User want to verify the homepage functionality

  @HomepageTest
  Scenario: Amazon Homepage title verification
    Given Open the Chrome and Launch the amazon application
    When User on amazon homepage
    Then Verify meta title of the page

  @HompageTest
  Scenario: Should not be Amazon Homepage
    Given Open the Chrome and Launch the amazon application
    When Navigate user on different link
    Then Verify meta title of the curent page
