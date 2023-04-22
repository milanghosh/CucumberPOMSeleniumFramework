Feature: Add products to Cart and Verify added

  Background: login
    Given user has already logged in to application
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario: Add Products To Cart
    Then user adds "bike-light" to cart
    Then user adds "backpack" to cart
    And user clicks on cart
    Then user verifies "Sauce Labs Backpack" in cart Page
    Then user verifies "Sauce Labs Bike Light" in cart Page
