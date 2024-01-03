#Author: xxx@gmail.com
@SearchTest
Feature: Search products on amazon app
  User wants to search multiple products on amazon app

  @SearchTest
  Scenario: Verification of search feature button with number of products
    Given Open firefox browser and Amazon application
    And Maximize browser window
    Then Enter the product search in the search bar
      | product-name      | page-title                    |
      | Iphone 15 pro max | Amazon.in : Iphone 15 pro max |
      | Apple Mac book    | Amazon.in : Apple Mac book    |
    Then Submit  the product
    And Clear search bar
