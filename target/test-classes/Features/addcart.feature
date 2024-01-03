#Author: xxx@gmail.com
@FeatureTest
Feature: Add to cart
  This feature will test functionality of adding various products to the user's cart(basket) from different flow

  Background: User is logged in

  @AddCartTest
  Scenario: Search a product and add the first product/result to basket
    Given User search for a product "Acer Aspire7 Laptop"
    When add the first laptop that appears in the  search results to the basket
    And user clicks on cart link
    Then user basket should display added 1 item
