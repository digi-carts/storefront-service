Feature: Storefront store component
  Scenario: list stores
    When I GET "/stores"
    Then the response status is 200
