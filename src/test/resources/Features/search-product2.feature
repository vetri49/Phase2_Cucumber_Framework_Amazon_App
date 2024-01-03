@SearchTest2 @SmokeTest
Feature: Search product on amazon e-commerce web application
  User wants to search multiple products on amazon

  @SearchTest2 @SmokeTest
  Scenario Outline: Search feature button with number of products on amazon
    Given Launch Amazon application on firefox browser
    When Enter the product "<product>"
    Then Submit product
    And Confirm the page title "<title>"

    Examples: 
      | product           | title                         |
      | Iphone 15 pro max | Amazon.in : Iphone 15 pro max |
      | Apple Mac book    | Amazon.in : Apple Mac book    |
