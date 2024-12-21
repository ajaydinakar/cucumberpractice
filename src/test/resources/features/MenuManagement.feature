

  Feature: Menu Management

    Scenario: Add a menu item
      Given I have a menu item with name "Cucumeber Sandwich" and price 20
      When I add that menu item
      Then Menu Item with name "Cucumeber Sandwich" should be added